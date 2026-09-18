import org.json.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;




public class Main {


    public static void basicJsonObject(){
        JSONObject jo = new JSONObject();
                jo.put("name", "jon doe");
                jo.put("age", "22");
                jo.put("city", "chicago");
                System.out.println(jo);
    }
    public static void basicJsonObjectFromMap(){
        Map<String, String> map = new HashMap<>();
                map.put("name", "jon doe");
                map.put("age", "22");
                map.put("city", "chicago");
                JSONObject jo2 = new JSONObject(map);
                System.out.println(jo2);
    }
    public static void basicJsonObjectFromString(){
        JSONObject j3_str = new JSONObject(
            " {\"guid\":\"h3lvUKwCMrs9\",\"title\":\"софийски\",\"index\":108,\"dateAdded\":1736388356000000,\"lastModified\":1766943116860000,\"id\":815,\"typeCode\":1,\"type\":\"text/x-moz-place\",\"uri\":\"https://elearn.uni-sofia.bg/enrol/index.php?id=2402\"}"
            );
            System.out.println(j3_str);
            System.out.println(j3_str.getString("guid"));
            System.out.println(j3_str.getString("title"));
            System.out.println(j3_str.getBigInteger("index"));
            System.out.println(j3_str.getLong("dateAdded"));
            System.out.println(j3_str.getLong("lastModified"));
            System.out.println(j3_str.getBigInteger("id"));
            //System.out.println(j3_str.getString("typecode"));
            System.out.println(j3_str.getString("type"));
            System.out.println(j3_str.getString("uri"));
    }
    public static void basicJsonArray(){

        JSONArray ja = new JSONArray();
        ja.put(Boolean.TRUE);
        ja.put("lorem ipsum");

        JSONObject jo = new JSONObject();
        jo.put("name", "jon doe");
        jo.put("age", "22");
        jo.put("city", "chicago");

        ja.put(jo);

        System.out.println(ja);
        System.out.println(jo);

    }


    public static void dateTimeCustomFormatting(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a");
        LocalDateTime ldt = LocalDateTime.now();
        String dateTimeString = ldt.format(dateTimeFormatter);
        System.out.println("Raw:\t" + ldt);
        System.out.println("Formatted:\t" + dateTimeString);


        // epoch long to localdatetime
        // date added epoch to localdatetime with formatting
        // given value is in micro_seconds -> supported is milis
        long epochTimeMicros = Long.valueOf("1733575953000000"); // From string to Long type;
        // "1733575953000000" ---> 1733575953000000L
        Instant instant = Instant.ofEpochMilli(epochTimeMicros/1000); // /100 because the original is 000-000 (microseconds)
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDate localDate = instant.atZone(zoneId).toLocalDate();
        System.out.println("[Date] 1736388356000000 is = " + localDate);

        LocalDateTime totime = instant.atZone(zoneId).toLocalDateTime();
        System.out.println("[Datetime] 1736388356000000 is = " + totime);
    }
    public static void manipulateFileMetadata_read(){

        // Manipulate Windows file metadata last modified and date created

        String file = "./src/files_for_testing/ss64.url";
        //String file = "./src/files_for_testing/ManipulateDate-Modified_Created/myUrl - manipulatedDateModified.url"; // [2022-01-16 11:00:00]

        Scanner sc = new Scanner(System.in);
        try{
            System.out.println(file);
            BufferedReader bufferedReader = new BufferedReader( new FileReader(file));
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

            DateTimeFormatter DATE_FORMATTER =
                    DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a");

            BasicFileAttributes attr = Files.readAttributes(Path.of(file), BasicFileAttributes.class);
            // default YYYY-MM-DDThh:mm:ss[.s+]Z
            System.out.println("[Default] lastModifiedTime: " + attr.lastModifiedTime());

            FileTime fileTime = attr.lastModifiedTime();
            LocalDateTime localDateTime = fileTime.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
            System.out.println("[Custom format] lastModifiedTime: " + localDateTime.format(DATE_FORMATTER));
            // https://mkyong.com/java/how-to-format-filetime-in-java/


        } catch (Exception e ){

            System.err.println("Something went wrong :/");
            System.out.println(e);
            e.printStackTrace();

        } finally {
            sc.close();
        }
    }


    public static void parsingJsonSmall() throws IOException{

        String filePath = "src/files_for_testing/1.json";
        String jsonContent = new String(Files.readAllBytes(Paths.get(filePath))); // instead of while (line){}
        // un-packaging process;
        JSONObject jsonTextObj = new JSONObject(jsonContent.trim()); // get the raw data

        System.out.println(jsonTextObj.getJSONObject("address")); // one nested object

        // Source - https://stackoverflow.com/a/10593838
        // Posted by Rickey, modified by community. See post 'Timeline' for change history
        // Retrieved 2026-09-18, License - CC BY-SA 4.0

        // ====GOLD======
        Iterator<String> keys = jsonTextObj.keys();
        while(keys.hasNext()) {
            String key = keys.next();
            if (jsonTextObj.get(key) instanceof JSONObject) {
                // do something with jsonObject here
                System.out.println(jsonTextObj.getJSONObject(key));
            } else if(jsonTextObj.get(key) instanceof JSONArray){
                System.out.println(jsonTextObj.getJSONArray(key));
            }
        }
        /*  TODO:
                - implement as a recursive fucntion to iterate through every key which is
                - either a JsonObject or a Json array;

            TODO:
                Structure
                JSONObject has a 'children' JSON Array
                Each JSON array has N JSON object (which can have also JSON arrays) (recursive nested types)

            TODO:
                 JSONObject
                    JSONArray1
                       JSONObject1
                       JSONObject2
                       JSONObjectN
                    JSONArray2
                       JSONObject1
                       JSONObject2
                       JSONObjectN
                       .
                       .
                       .

         */


        /* TODO:
            - make file
                - get cerain keys
                    - title
                    - uri
                    - dateAdded
                        - epoch calc module to normal date
                        - module for dateCreated in explorer exe manipulation change
            - Recursive iteration for
                - Children (json Array)
                    - Each index (json object)
                        - Get data, make file, go to the next

         */




        JSONArray ja1 = jsonTextObj.getJSONArray("phoneNumbers"); // one nested, but an array this time
        System.out.println(ja1);

    }

    public static void parsingJsonBig() throws IOException {
        String filePath = "src/files_for_testing/bigboss - copy.json";
        String jsonContent = new String(Files.readAllBytes(Paths.get(filePath))); // instead of while (line){}


        // un-packaging process;
        JSONObject jsonTextObj = new JSONObject(jsonContent); // get the raw data

        JSONArray  jsonArray_First = jsonTextObj.getJSONArray("children");
            JSONObject jsonObject_third = jsonArray_First.getJSONObject(3);
                JSONArray jsonObject_third_array = jsonObject_third.getJSONArray("children");
                    JSONObject jo = jsonObject_third_array.getJSONObject(0);

        System.out.println(jo.getString("uri"));



        //https://medium.com/@AlexanderObregon/javas-jsonparser-parse-method-explained-76b126f6110e
    }



    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);


        try{

            //basicJsonObject();
            //basicJsonObjectFromMap();
            //basicJsonObjectFromString();
            //basicJsonArray();

            parsingJsonSmall();

            //parsingJsonBig();


            //dateTimeCustomFormatting();
            //manipulateFileMetadata_read();



        } catch (Exception e){
            System.err.println("Something went wrong");
            e.printStackTrace();

        } finally {
            inputScanner.close();
        }



    }
}

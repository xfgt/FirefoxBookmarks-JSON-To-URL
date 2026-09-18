import org.json.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;




public class Main {






    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);


        try{

            //  Basic json object
            {
                JSONObject jo = new JSONObject();
                jo.put("name", "jon doe");
                jo.put("age", "22");
                jo.put("city", "chicago");
                System.out.println(jo);
            }


            // Json object from map ds
            {
                Map<String, String> map = new HashMap<>();
                map.put("name", "jon doe");
                map.put("age", "22");
                map.put("city", "chicago");
                JSONObject jo2 = new JSONObject(map);
                System.out.println(jo2);
            }






            // Make json object form string
            {
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








            // Datetime with custom formatting
            {
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




            // Manipulate windows file metadata last modified and date created
            { // Read metadata
                String file = "./src/files_for_testing/myUrl.url";

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


            // JSON Array
            {

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







        } catch (Exception e){
            System.err.println("Something went wrong");
            System.out.printf("%s", e.getMessage());

        } finally {
            inputScanner.close();
        }



    }
}

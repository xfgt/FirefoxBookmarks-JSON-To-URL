

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Nested;

public class JSONTest {
    
    
    @Nested
    class jsonArrayIterations {
        
       @Test
        void jsonArrayIterationsTest() {
            try{

                String filePath = "src/files_for_testing/jsonArrays.json";
                String jsonContent = new String(Files.readAllBytes(Paths.get(filePath))); // instead of while (line){}
                JSONObject jsonObject = new JSONObject(jsonContent.trim()); // get the raw data

                Iterator<String> keys = jsonObject.keys();
                while(keys.hasNext()) {
                    String key = keys.next();
                    if(jsonObject.get(key) instanceof JSONArray){ // if it's an JSON array
                        // iterate through each object and call recursively

                        JSONArray childArray = new JSONArray(jsonObject.getJSONArray(key));
                        for(int i = 0; i < childArray.length(); i++){
                            // Todo: json array, array list, index, map, contents
                            JSONObject childObject = childArray.getJSONObject(i);
                            String title = childObject.getString("title");
                            Long dateAdded = childObject.getLong("dateAdded");
                            Long dateLastModified = childObject.getLong("lastModified");
                            String uri = childObject.getString("uri");

                            System.out.printf("%s\n, %s\n, %s\n, %s\n",title, dateAdded, dateLastModified, uri);
                            // construct an object


                        }
                    }
                } // end of while



            } catch (Exception e) {
                e.printStackTrace();
            }

        } 
    }
    
    

    @Nested
    class JsonMapTests{
        @Test
        public void givenJSON_whenParsed_thenCorrectValueReturned() {
            String jsonString = """
                            {
                                "type": "Feature", 
                                "geometry": "Point",
                                "properties": {
                                                  "isValid": true, 
                                                  "name": "Sample Point"
                                              }
                            }
                            """;
            JSONObject jsonObject = new JSONObject(jsonString);
            String type = jsonObject.getString("type");
            String geometry = jsonObject.getString("geometry");
            JSONObject properties = jsonObject.getJSONObject("properties");
            boolean isValid = properties.getBoolean("isValid");


            assertEquals(type,"Feature");
            assertEquals(geometry,"Point");
            assertTrue(isValid);
        }

        @Test
        public static void basicJsonObject(){
            JSONObject jo = new JSONObject();
                    jo.put("name", "jon doe");
                    jo.put("age", "22");
                    jo.put("city", "chicago");
                    System.out.println(jo);
        }

        @Test
        public static void basicJsonObjectFromMap(){
            Map<String, String> map = new HashMap<>();
                    map.put("name", "jon doe");
                    map.put("age", "22");
                    map.put("city", "chicago");
                    JSONObject jo2 = new JSONObject(map);
                    System.out.println(jo2);
        }

        @Test
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

        @Test
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
    }
    
    
    
    
}

import org.json.JSONArray;
import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class jsonArrayIterations {



    public static void main(String[] args) {


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

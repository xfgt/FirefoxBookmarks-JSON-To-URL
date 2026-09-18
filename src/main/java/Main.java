import org.json.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {






    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);


        try{





            //  Basic json object
            JSONObject jo = new JSONObject();
            jo.put("name", "jon doe");
            jo.put("age", "22");
            jo.put("city", "chicago");
            System.out.println(jo);



            // Json object from map ds
            Map<String, String> map = new HashMap<>();
            map.put("name", "jon doe");
            map.put("age", "22");
            map.put("city", "chicago");
            JSONObject jo2 = new JSONObject(map);
            System.out.println(jo2);


            // Make json object form string
            JSONObject j3_str = new JSONObject(
                    " {\"guid\":\"h3lvUKwCMrs9\",\"title\":\"софийски\",\"index\":108,\"dateAdded\":1736388356000000,\"lastModified\":1766943116860000,\"id\":815,\"typeCode\":1,\"type\":\"text/x-moz-place\",\"uri\":\"https://elearn.uni-sofia.bg/enrol/index.php?id=2402\"}"
            );
            System.out.println(j3_str);














        } catch (Exception e){
            System.err.println("Something went wrong");
            System.out.printf("%s", e.getMessage());

        } finally {
            inputScanner.close();
        }



    }
}

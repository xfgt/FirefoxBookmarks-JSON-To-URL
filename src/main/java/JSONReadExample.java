import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONReadExample {
    public static void main(String[] args) throws Exception {

        Object obj = new JSONParser().parse(new FileReader("JSONExample.json"));
        JSONObject jo = (JSONObject) obj;

        String firstName = (String) jo.get("firstName");
        String lastName = (String) jo.get("lastName");
        long age = (long) jo.get("age");

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);

        Map address = (Map) jo.get("address");
        for (Object entry : address.entrySet()) {
            Map.Entry pair = (Map.Entry) entry;
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }

        JSONArray phoneNumbers = (JSONArray) jo.get("phoneNumbers");
        for (Object phoneObj : phoneNumbers) {
            Map phone = (Map) phoneObj;
            for (Object entry : phone.entrySet()) {
                Map.Entry pair = (Map.Entry) entry;
                System.out.println(pair.getKey() + " : " + pair.getValue());
            }
        }
    }
}
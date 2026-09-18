import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JSONTest {
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
}

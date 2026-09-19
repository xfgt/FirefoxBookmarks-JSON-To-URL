import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.SimpleFormatter;

public class EpochConverterTest {


    EpochConverter epochConverter;
    LocalDateTime localDateTime;
    DateTimeFormatter sampleFormat;
    String sampleFormatPattern;
    @BeforeEach
    public void init(){
        sampleFormatPattern = "yyyy-MM-dd HH:mm:ss";        //for example 2005-12-08T11:44:39
        sampleFormat = DateTimeFormatter.ofPattern(sampleFormatPattern);
    }


    @Test
    void whenGivenEpoch_thenCorrectValue(){
        String sampleEpoch = "1134035079";
        localDateTime = LocalDateTime.of(1970,1, 1, 3, 18, 54);

        epochConverter = new EpochConverter(sampleEpoch, sampleFormatPattern);
        assertEquals(localDateTime.format(sampleFormat), epochConverter.get_localDateTimeFormatted());
        assertEquals(localDateTime, epochConverter.get_localDateTimeNoNano());

    }
    @Test
    void whenGivenEpoch_thenCorrectValue2(){
        String sampleEpoch = "766276326";
        localDateTime = LocalDateTime.of(1970,1, 1, 3, 12, 46);
        epochConverter = new EpochConverter(sampleEpoch, sampleFormatPattern);
        assertEquals(localDateTime.format(sampleFormat), epochConverter.get_localDateTimeFormatted());  // Test string return value
        assertEquals(localDateTime, epochConverter.get_localDateTimeNoNano());                          // Test LocalDateTime return value, with no nano

    }

    @Test
    void whenGivenEpoch_thenCorrectValue3(){
        String sampleEpoch = "1779639308824000";
        localDateTime = LocalDateTime.of(2026,5, 24, 19, 15, 8);
        epochConverter = new EpochConverter(sampleEpoch, sampleFormatPattern);
        assertEquals(localDateTime.format(sampleFormat), epochConverter.get_localDateTimeFormatted());
        assertEquals(localDateTime, epochConverter.get_localDateTimeNoNano());
    }
    @Test
    void whenGivenEpoch_thenCorrectValue4(){
        String sampleEpoch = "1780031858092000";
        localDateTime = LocalDateTime.of(2026,5, 29, 8, 17, 38);
        epochConverter = new EpochConverter(sampleEpoch, sampleFormatPattern);
        assertEquals(localDateTime.format(sampleFormat), epochConverter.get_localDateTimeFormatted());
        assertEquals(localDateTime, epochConverter.get_localDateTimeNoNano());
    }

}

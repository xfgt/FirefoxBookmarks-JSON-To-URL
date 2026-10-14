import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;



/***
 * A class holding responsibility for converting 
 * epoch values into actual TimeDate values based on the system locale.
 * 
 * The default epoch is in microseconds (1733575953000000) -> 000 000
 * 
 * Source for helping with debugging data conversion: https://www.epochconverter.com/
 * @author xfgt
 */



public class EpochConverter {

    

    private String _dateTimePattern;
    private long _epochTimeMicroseconds; 
   
    private Instant _instant;
    private ZoneId _zoneId;
    private LocalDateTime _localDateTime;
    private DateTimeFormatter _dateTimeFormatter;

    
    // Do we separate first two in different class?
    // Do we create interfaces for later inplementation?
    // Hmmmm...
    
    
    // Constructor accepting String
    public EpochConverter(String dateTimeEpoch, String dateTimeFormatPattern){
        this._dateTimePattern = dateTimeFormatPattern;
        this._epochTimeMicroseconds = Long.parseLong(dateTimeEpoch);                     
        this._instant = Instant.ofEpochMilli(_epochTimeMicroseconds/1000); // microseconds  
        this._zoneId = ZoneId.systemDefault();
        this._localDateTime = this._instant.atZone(this._zoneId).toLocalDateTime();
        this._dateTimeFormatter = DateTimeFormatter.ofPattern(dateTimeFormatPattern);

    }
    
    
    // Constructor accepting Long
    public EpochConverter(Long dateTimeEpoch, String dateTimeFormatPattern){
        this._dateTimePattern = dateTimeFormatPattern;
        this._epochTimeMicroseconds = dateTimeEpoch; // Long
        this._instant = Instant.ofEpochMilli(_epochTimeMicroseconds/1000); // microseconds
        this._zoneId = ZoneId.systemDefault();
        this._localDateTime = this._instant.atZone(this._zoneId).toLocalDateTime();
        this._dateTimeFormatter = DateTimeFormatter.ofPattern(dateTimeFormatPattern);

    }

    public String get_dateTimePattern() {
        return _dateTimePattern;
    }

    public void set_dateTimePattern(String _dateTimePattern) {
        this._dateTimePattern = _dateTimePattern;
    }

    public long get_epochTimeMicroseconds() {
        return _epochTimeMicroseconds;
    }

    public void set_epochTimeMicroseconds(long _epochTimeMicroseconds) {
        this._epochTimeMicroseconds = _epochTimeMicroseconds;
    }
    
    public void set_epochTimeMicroseconds_ofString(String _epochTimeMicroseconds) {
        // Todo: proverka za validnost na stringa
        if(_epochTimeMicroseconds.isEmpty())
            this._epochTimeMicroseconds = 0; // Thursday, January 1, 1970 at 3:00:00 AM
        else
            this._epochTimeMicroseconds = Long.parseLong(_epochTimeMicroseconds);
    }
    
    public Instant get_instant() {
        return _instant;
    }

    public void set_instant(Instant _instant) {
        this._instant = _instant;
    }

    public ZoneId get_zoneId() {
        return _zoneId;
    }

    public void set_zoneId(ZoneId _zoneId) {
        this._zoneId = _zoneId;
    }

    public LocalDateTime get_localDateTime() {
        return _localDateTime;
    }
    public LocalDateTime get_localDateTimeNoNano(){
        return _localDateTime.withNano(0);
    }
    public String get_localDateTimeFormatted(){
        return _localDateTime.format(_dateTimeFormatter);
    }

    public void set_localDateTime(LocalDateTime _localDateTime) {
        this._localDateTime = _localDateTime;
    }
    
    public DateTimeFormatter get_dateTimeFormatter() {
        return _dateTimeFormatter;
    }

    public void set_dateTimeFormatter(DateTimeFormatter _dateTimeFormatter) {
        this._dateTimeFormatter = _dateTimeFormatter;
    }



}

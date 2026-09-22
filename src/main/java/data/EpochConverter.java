import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class EpochConverter {

    // Epoch is in microseconds (1733575953000000) -> 000 000

    String _dateTimePattern;
    DateTimeFormatter _dateTimeFormatter;
    long _epochTimeMicroseconds;
    Instant _instant;
    ZoneId _zoneId;
    LocalDateTime _localDateTime;

    // Accepting type String epoch value
    public EpochConverter(String dateTimeEpoch, String dateTimeFormatPattern){
        // epoch long to localdatetime
        // date added epoch to localdatetime with formatting
        // given value is in micro_seconds -> supported is milis
        // Todo: proverka validnost na string-a
        this._dateTimePattern = dateTimeFormatPattern;
        this._epochTimeMicroseconds = Long.valueOf(dateTimeEpoch); // From string to Long type; // "1733575953000000" ---> 1733575953000000L

        //https://www.epochconverter.com/
        this._instant = Instant.ofEpochMilli(_epochTimeMicroseconds/1000); // '/1000' because the original is 000-000 (microseconds)
        this._zoneId = ZoneId.systemDefault();
        this._localDateTime = this._instant.atZone(this._zoneId).toLocalDateTime();
        this._dateTimeFormatter = DateTimeFormatter.ofPattern(dateTimeFormatPattern);

    }
    // accepting type Long epoch value
    public EpochConverter(Long dateTimeEpoch, String dateTimeFormatPattern){
        // epoch long to localdatetime
        // date added epoch to localdatetime with formatting
        // given value is in micro_seconds -> supported is milis
        // Todo: proverka validnost na string-a
        this._dateTimePattern = dateTimeFormatPattern;
        this._epochTimeMicroseconds = dateTimeEpoch; // Long

        //https://www.epochconverter.com/
        this._instant = Instant.ofEpochMilli(_epochTimeMicroseconds/1000); // '/1000' because the original is 000-000 (microseconds)
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

    public DateTimeFormatter get_dateTimeFormatter() {
        return _dateTimeFormatter;
    }

    public void set_dateTimeFormatter(DateTimeFormatter _dateTimeFormatter) {
        this._dateTimeFormatter = _dateTimeFormatter;
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
            this._epochTimeMicroseconds = Long.valueOf(_epochTimeMicroseconds);
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




}

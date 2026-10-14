import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.ZoneId;

public class EpochMicrosecondsTest {



    @Test
    void sample(){

        String val = "824498445";
        long aki = Long.parseLong(val);


        Instant i = Instant.ofEpochSecond(aki/1000/1000);
        ZoneId zid;
        System.out.println(ZoneId.getAvailableZoneIds());



        System.out.println(ZoneId.systemDefault() + " === " + i.atZone(ZoneId.systemDefault()));


        /***
         * 14.10.26g.
         * Не са ни необходими LocalDateTime и DateTimeForamtter; те бяха необходими само когато
         * разработвахме теста на алгоритъма за прочитане на всеки един от обектите във файла и
         * изкарването на датите в четим формат в конзолата.
         * Досега се водихме по следната схема:
         * long (epoch) -> instant -> ZoneId -> LocalDateTime -> DateTimeFormatter
         *
         *
         * За реалните цели на програмата, е необходимо да се въведе механизъм, който
         * си взаимодейства с FileTime класът и образува обект, който да се използва
         * в редактирането на метадатанните на файла – lastModifiedDate, dateCreated.
         * Доколкото проучих, за момента трябва да сменим схемата на зависимости:
         * String -> long -> Instant + ZoneId -> FileTime object, който после ще ползваме за:
         *
         *      Files.setAttribute(path, "basic:creationTime", myTime, NOFOLLOW_LINKS);  // редактиране dateCreated
         *      Files.setLastModifiedTime(path, myTime);                                 // редактиране dateLastModified
         */


    }
}

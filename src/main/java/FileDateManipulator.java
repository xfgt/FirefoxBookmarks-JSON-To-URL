import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FileDateManipulator {

    /*
        Different module for reading and writing to a file and
        changing its date created and last modified based on the LocalDate (made from epoch value)
    */



    public static void manipulateFileMetadata_read(){

        // Manipulate Windows file metadata last modified and date created

        String file = "./src/files_for_testing/ss64.url";
        //String file = "./src/files_for_testing/ManipulateDate-Modified_Created/myUrl - manipulatedDateModified.url"; // [2022-01-16 11:00:00]

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
}

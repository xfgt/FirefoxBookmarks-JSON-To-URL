
/*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
     */

    import java.io.FileNotFoundException;
    import java.io.FileWriter;
    import java.io.IOException;
    import java.nio.file.Files;
    import static java.nio.file.LinkOption.NOFOLLOW_LINKS;
    import java.nio.file.Path;
    import java.nio.file.Paths;
    import java.nio.file.attribute.BasicFileAttributes;
    import java.nio.file.attribute.FileTime;
    import java.text.DateFormat;
    import java.text.SimpleDateFormat;
    import java.time.Instant;
    import java.time.LocalDateTime;
    import java.time.ZoneId;
    import java.time.format.DateTimeFormatter;
import org.junit.jupiter.api.Test;

    /**
     *
     * @author xfgt
     */

    
public class FileMetadataTests {
    

        /**
         * @throws java.io.FileNotFoundException
         */

    @Test
    public void asdf() throws IOException {
        // TODO code application logic here
            System.out.println("здравей");
            // -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 

            // managing timestamps of epoch values
            long value = 1013334932;
            Instant instantPoint = Instant.ofEpochSecond(value);


            // formatting a timestamp to normal date format based on a pattern and zone id        
            LocalDateTime ldt = LocalDateTime.ofInstant(instantPoint, ZoneId.systemDefault());
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            System.out.println(ldt.format(formatter));

            // present the system zone id to the user
            ZoneId zid = ZoneId.systemDefault();
            System.out.println(zid.toString());

            
            // long (epoch) -> instant -> ZoneId -> LocalDateTime -> DateTimeFormatter

            //https://catonmat.net/tools/generate-random-unix-timestamps


            // Modifying strings
            String someUrl = "https://youtube.com";
            String hhrp = "https://";
            System.out.println(someUrl.contains(hhrp)); // true


            // replace whitespaces with '-'
            String someTitle = "Poshtenska banka - tarifa za fizicheski lica".replaceAll("\\s+", "-");
            System.out.println(someTitle);

            String content = new String(Files.readAllBytes(Paths.get("newFile")));
            System.out.println(content);

            String bookmarkTitle = "Get Help";
            String bookmarkUrl = "https://support.mozilla.org/products/firefox";
            // "support.mozilla.firefox - Get Help"
            // <url_domain> - <BookmarkTitle>
            /***
             * Whenever making a file with name based on the title,
             * trim the file beforehand so it removes the unsupported 
             * symbols from the string
             * ? \ |":*\/<>/ \r \n
             */



            // Writing to a file
            try{
               FileWriter fr = new FileWriter("YouTube.url");

    //            fr.write("[InternetShortcut]" + System.lineSeparator());
    //            fr.write("URL=");
    //            fr.append(someUrl); 

                fr.write("[InternetShortcut]\nUrl=" + someUrl);
                fr.close();
            } catch (IOException e){
                e.printStackTrace();
            }


            String filePath = "newfile";
            System.out.printf("File: %s\n", filePath);
            Path path = Paths.get(filePath);
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");


    /// BEFORE
            // Date created
            FileTime creationTime = (FileTime) Files.getAttribute(path, "creationTime");
            System.out.println("Date created: " + dateFormat.format(creationTime.toMillis()));

            // Date modified
            FileTime modifiedTime = Files.getLastModifiedTime(path);
            System.out.println("Date modified: " + dateFormat.format(modifiedTime.toMillis()));


    /// CHANGE
            FileTime myTime = FileTime.from(instantPoint);
            Files.setLastModifiedTime(path, myTime); // this

            long epoche = 1218881030;
            Instant instantv = Instant.ofEpochSecond(epoche);
            myTime = FileTime.from(instantv);

            Files.setAttribute(path, "basic:creationTime", myTime, NOFOLLOW_LINKS); 
            // https://thinktibits.blogspot.com/2012/12/Change-date-created-time-for-file-in-java-example-program.html



    /// AFTER
            // Date created
            System.out.println("Date created: " + dateFormat.format(creationTime.toMillis()));

            // Date modified
            System.out.println("Date modified: " + dateFormat.format(modifiedTime.toMillis()));





            //get info about file metadata
            Path file = Paths.get(filePath);
            System.out.println("All metadata:");
            BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);


            IO.println("creationTime: " + attr.creationTime());
            IO.println("lastAccessTime: " + attr.lastAccessTime());
            IO.println("lastModifiedTime: " + attr.lastModifiedTime());

            IO.println("isDirectory: " + attr.isDirectory());
            IO.println("isOther: " + attr.isOther());
            IO.println("isRegularFile: " + attr.isRegularFile());
            IO.println("isSymbolicLink: " + attr.isSymbolicLink());
            IO.println("size: " + attr.size() + " bytes");
    }

    
}
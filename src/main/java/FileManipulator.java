import java.io.BufferedReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.Scanner;


public class FileManipulator {

    String _filePath;
    String _textContent;
    BufferedReader _bufferedReader;
    FileWriter _fileWriter;


    public static void example_read(){

        Scanner sc = new Scanner(System.in);



        String filePath = "./src/files_for_testing/myUrl.url";


        try{
            System.out.println(filePath);
            BufferedReader bufferedReader = new BufferedReader( new java.io.FileReader(filePath));
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

            String textContent = new String(Files.readAllBytes(Paths.get(filePath))); // instead of while (line){}
            System.out.println("Option #2:\r\n" + textContent);

        } catch (Exception e ){

            System.err.println("Something went wrong :/");
            System.out.println(e);

        } finally {
            sc.close();
        }

    }

    public static void example_write() {
        Scanner sc = new Scanner(System.in);


        try {

            {
                FileWriter fileWriter = new FileWriter("fileWriter3.txt");
                fileWriter.write("asdfhlello! :D");
                fileWriter.append("bisqwit");
                fileWriter.append('c' + System.lineSeparator()); // new line
                fileWriter.write("amogus" + "\r\n");

                fileWriter.write(fileWriter.getEncoding());
                fileWriter.flush();
                fileWriter.close();
            }

            {
                FileWriter fileWriter = new FileWriter("myUrl.url");
                fileWriter.write("[InternetShortcut]" + System.lineSeparator());
                fileWriter.write("URL=https://youtube.com/" + System.lineSeparator());
                fileWriter.write("Modified=20F06BA06D07BD014D");
                /*
                    // https://www.cyanwerks.com/formats/file-format-url.html#urlformat
                    // https://ovanttasks.sourceforge.net/roxes-win32/chapter-.url-format.html

                    The Modified field in a .url file uses a hexadecimal timestamp format that encodes a date and time, with the value 20F06BA06D07BD014D representing a specific moment tracked by Windows.
                 */

                fileWriter.flush();
                fileWriter.close();
            }


        } catch (Exception e) {
            System.err.println("Something went wrong. :/");
            System.out.println(e);
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}

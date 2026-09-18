import javax.sound.midi.SysexMessage;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class myFileWriter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String base = "E:\\oldQ\\VMshared\\Github\\local_repos-notUploadedYet\\todo-Browser-Bookmarks\\json-to-url_java\\samples";

        try{

            FileWriter fileWriter = new FileWriter(base+"\\fileWriter3.txt");
            fileWriter.write("asdfhlello! :D");
            fileWriter.append("bisqwit");
            fileWriter.append('c'+ System.lineSeparator()); // new line
            fileWriter.write("amogus" + "\r\n");

            fileWriter.write(fileWriter.getEncoding());
            fileWriter.flush();
            fileWriter.close();









        }catch (Exception e ){
            System.err.println("Something went wrong. :/");
            System.out.println(e);
            e.printStackTrace();
        } finally {
            sc.close();
        }






    }
}

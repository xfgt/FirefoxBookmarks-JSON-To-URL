import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;


public class fileReader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String base = "E:\\oldQ\\VMshared\\Github\\local_repos-notUploadedYet\\todo-Browser-Bookmarks\\json-to-url_java\\samples";
        String filePath = base+"\\bigboss.json";


        try{
            BufferedReader bufferedReader = new BufferedReader( new FileReader(filePath));
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }







        } catch (Exception e ){

            System.err.println("Something went wrong :/");
            System.out.println(e);

        } finally {
            sc.close();
        }







    }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;


public class fileReader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        String filePath = "./src/files_for_testing/myUrl.url";


        try{
            System.out.println(filePath);
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

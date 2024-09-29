import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReadExample {

    public static void main(String[] args) {
        File myFile=new File("aryan.txt");
        /*try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }*/
        try{
            Scanner sc=new Scanner(myFile);
            while(sc.hasNextLine())
            {
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

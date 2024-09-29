import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args)
    {
        try {
            FileWriter fileWriter = new FileWriter("aryan.txt");
            fileWriter.write("this is our first java file hanadling writing example");
            System.out.println("done bro");
            fileWriter.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}

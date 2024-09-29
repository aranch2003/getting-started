import java.io.File;

public class DeleteFile {
    public static void main(String[] args)
    {
        File myFile=new File("aryan234.txt");
        if(myFile.delete())
        {
            System.out.println("I have deletd"+myFile.getName());
        }
        else {
            System.out.println("Error101");
        }
    }

}

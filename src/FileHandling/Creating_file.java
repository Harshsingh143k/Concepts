package FileHandling;

import java.io.File;
import java.io.IOException;

public class Creating_file {
    public static void main(String[] args) throws IOException {
        File myfile=new File("FilePath.txt");//creating file with providing file path in parameters
        myfile.createNewFile();//using createNewFile() for creating new file
        System.out.println("File Create Sucessfully");
    }
}

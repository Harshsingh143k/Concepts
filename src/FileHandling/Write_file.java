package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Write_file {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter=new FileWriter("FilePath.txt");
            fileWriter.write("hello guys , we are coding with harsh sir \n we enjoy to code ");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

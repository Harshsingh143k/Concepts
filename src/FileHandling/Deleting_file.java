package FileHandling;

import java.io.File;
import java.io.IOException;

public class Deleting_file {
    public static void main(String[] args) throws IOException {
        File myfile=new File("hello.txt");//
        myfile.createNewFile();//creating a file
        if(myfile.delete()){//deleting file
            System.out.println("i have deleted file "+myfile.getName());
        }
        else{
            System.out.println("Getting some problem while deleting a file  "+myfile.getName());
        }
    }
}

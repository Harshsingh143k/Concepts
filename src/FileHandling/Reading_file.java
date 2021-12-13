package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reading_file {
    public static void main(String[] args) throws FileNotFoundException {
        File myfile = new File("FilePath.txt");

            Scanner sc = new Scanner(myfile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);

            }
            sc.close();


        }
    }




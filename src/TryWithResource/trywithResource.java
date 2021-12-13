package TryWithResource;

import java.util.Scanner;

public class trywithResource {
    public static void main(String[] args) {
        try(Scanner s= new Scanner(System.in)){
           var a=s.nextInt();
            System.out.println(a/0);
             System.out.println(s);

        }
        catch(Exception obj){
            System.out.println(obj);
            System.out.println(obj.getMessage());
        }
    }

}

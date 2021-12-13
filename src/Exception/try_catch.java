package Exception;

import java.util.Scanner;

public class try_catch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number: ");

        int a= sc.nextInt();
        System.out.println("Enter b number: ");
        int b=sc.nextInt();
       try{                                          //try block will execute if the no_exception occured while Executing program
           System.out.println("Result of a/b : "+a/b);
       }catch(ArithmeticException obj){                  // catch will run if exception is occurred in the program
           System.out.println("result having problem because of: ");
           System.out.println(obj);
       }
        System.out.println("Happy Execution of the program:-))");
    }
}

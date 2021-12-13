package Exception;



import java.util.Scanner;

public class Finally_block {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        try{
            System.out.println("enter the value of a");
            int a=sc.nextInt();
            System.out.println("enter the value of b");
            int b=sc.nextInt();
            int c=a/b;
            System.out.println(c);
        }catch(ArithmeticException obj){
            System.out.println(obj);
        }finally{                                   // catch is UNABLE TO handle Exception and program will terminate ..but and only  finally block will be executed
            System.out.println(" i  am from the finally block");
        }

        System.out.println(" now  i Am after the finally block");//this  will not execute  if catch is unable ro handle Exception

    }
}

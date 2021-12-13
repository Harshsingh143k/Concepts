package Exception;
import java.util.Scanner;

public class Try_Finally {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try{// if we will get  error in the System of the try block .....then only try block will execute
            System.out.println("enter the value of A");
            float a=sc.nextInt();
            System.out.println("enter the value of B");
            float  b=sc.nextInt();
            float c= a/b;

            System.out.println("ressult of the A/B : "+c);

        }finally{//....it will execute anyhow ..it  is independent , from  the try  & Catch block
            System.out.println(" i am from the Finally Block");

        }

    }
}

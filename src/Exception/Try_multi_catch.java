package Exception;

import java.lang.reflect.Array;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_multi_catch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[]=new int[6];
        arr1[0]=12;
        arr1[1]=10;
        arr1[2]=12;
        arr1[3]=0;
        arr1[4]=188;
        arr1[5]=5713;
        //multiple catch will handle multiple exception handling
        // this will help to catch multiple error in one way
        try{                                      //try block
        System.out.println("Enter Index ");
        int b=sc.nextInt();
        System.out.println("enter number for division");
        int c=sc.nextInt();


            int d=arr1[b]/c;
            System.out.println("result of given data is : "+d);
        }catch(ArithmeticException obj){                        // catch 1
            System.out.println("it will get ArithmeticException : "+obj);
            System.out.println(obj);
        }catch(InputMismatchException obj){                      //catch2
            System.out.println(" it will get InputMismatchException : "+obj);
        }catch(ArrayIndexOutOfBoundsException obj){             //catch3
            System.out.println("ArrayIndexOutOfBoundsException will occoured : "+obj);

        }catch(Exception e){                                 //catch4
            System.out.println("Some Other Exception will occured : "+e);
        }
        System.out.println("happy execution of the programme");

    }
}

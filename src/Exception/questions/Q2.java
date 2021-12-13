package Exception.questions;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        // write a java program that print "hhahhahahaha " during Arithmetic Exception, And "heheehe" during an illegal Argument Exception
        Scanner sn=new Scanner(System.in);

        try{
           System.out.println("provide a valid number A");
           int a=sn.nextInt();
           System.out.println("provide a valid Number B");
           int b=sn.nextInt();
           int c=a/b;
           System.out.println(" out put will we :");
           System.out.println(c);
        }  catch(IllegalArgumentException a){
            System.out.println("hahaha");

        }catch(ArithmeticException s){


            System.out.println("hehhehhe");
        }
    }
}

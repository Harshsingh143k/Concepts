package Exception.questions;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        int [] marks=new int[3];
        marks[0]=12;
        marks[1]=53;
        marks[2]=34;
        int index;
        int i=0;
        while(flag && i<5){
           try{ index=sc.nextInt();
            System.out.println("the value of marks[index] is "+ marks[index]);
            break;
        }catch(Exception e){
               System.out.println("invalid index");
               i++;
           }
        }
        if (i>=5){//showing error  after exceding limit of the loop
            throw new ArithmeticException("hello i am here");

        
        }

    }
}

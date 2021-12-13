package Exception;

import java.util.Scanner;

class myException extends Exception{
    public String toString(){//we are here defining method inside class named Myexception
        return"value can not less than 5";

    }
    public String getMessage(){// defining a definition  of the methods
        return" make sure that the enter value as is valid";
    }
    public String OwnExceptionMethod(){// this I was trying to create Own Exception ..means  user Define method by the
        return " it is own created method for exception";

    }

}
public class User_define_exception {
    public static void main(String[] args) throws myException {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter value of a");

        int a = sc.nextInt();
        System.out.println("enter value of b");
        int b=sc.nextInt();
        float c=a/b;
        if (b<3){// this condition will throw  user define  exception

        try{
            throw new myException();//throwing user define exception
        }catch(Exception obj){
            System.out.println(obj.getMessage());
            System.out.println(obj.toString());
            System.out.println(obj.getStackTrace());
        }

        }else{
            System.out.println("result is : "+c);
        }





    }
}

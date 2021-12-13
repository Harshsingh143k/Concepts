package lab19;
//imporatant
class mythread implements Runnable{

    @Override
    public void run() {
        for(int i =0;i<10;i++){
            System.out.println("mythread90"+i);


        }

    }
}

public class classtest90 {
    private static Object Runnable;

    public static void main(String[] args) {
        mythread obj1= new mythread();
        //Thread obj=new Thread(new mythread());
        //Thread obj=new Thread(new Runnable() {
        Object runnable1 = Runnable;
//        (Runnable)
//        Thread obj=new Thread((Runnable) () -> {
//
//        } Runnable;
//        obj.start();
//        for(int i =0;i<10;i++){
            System.out.println("main thread");
//we are using the concept of multithreading
        }

    }


package lab19;
class Mythread67 extends Thread
{
   public  void  run()
{
        for(int i =0;i<10;i++){
            //System.out.println("my thread76"+i);
        }

    }

}

public class classTest {
    public static void main(String[] args) {
        Mythread67 obj=new Mythread67();
        Thread obj1=Thread.currentThread();
        System.out.println(obj.getPriority());
        System.out.println(obj1.getPriority());
        System.out.println(obj1.isAlive());
        obj1.setName("harsh");
        System.out.println(obj1.isDaemon());



        obj.start();
        for(int i =0;i<10;i++){
            //System.out.println("my thread"+i);
        }
    }
}

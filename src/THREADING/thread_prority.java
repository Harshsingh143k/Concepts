package THREADING;
class MYThread01 extends Thread{
    public MYThread01(String name){//constructor
        super(name);

    }
    public void run(){
        int i =43;
       // System.out.println("Thank you");
        System.out.println("MY PRIORITY IS "+this.getPriority()+" ,my name is "+this.getName());
//        while(true){
//            System.out.println("thank you"+this.getPriority());
//        }
    }

}
public class thread_prority {
    public static void main(String[] args) {
        MYThread01 t1=new MYThread01("harsh1");//creating object
        MYThread01 t2=new MYThread01("harsh2");
        MYThread01 t3=new MYThread01("harsh3");
        MYThread01 t4=new MYThread01("harsh4");
        MYThread01 t5=new MYThread01("harsh5");
        t1.setPriority(Thread.MAX_PRIORITY-8);//setting priority of threads
        t2.setPriority(Thread.MAX_PRIORITY-3);
        t3.setPriority(Thread.MIN_PRIORITY+3);
        t4.setPriority(Thread.MIN_PRIORITY+5);
        t5.setPriority(Thread.NORM_PRIORITY);
        t1.start();//giving kick to thread for starting........ thread execution
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}



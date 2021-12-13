package THREADING;
class MyThread1 extends Thread{//thread class1
        @Override
        public void run(){
                while(true){
                        System.out.println("hello i am thread1 and i am cooking with my brother");
                        System.out.println(" i am very happy");
                }
        }
}class MyThread2 extends Thread{//thread class2
        @Override
        public void run(){//run method of thread class
                while(true){
                        System.out.println("hello i am thread2 and i am dancing with my friends");
                        System.out.println(" i am neutral");
                }
        }
}

public class thread_class {
        public static void main(String[] args) {
                MyThread1 obj1=new MyThread1();//object of thread class1
                MyThread2 obj2=new MyThread2();//object of thread class2
                obj2.start();//applying start method that is inside thread(extends) class...that will indirectly linked with  run method
                obj1.start();




        }
        }

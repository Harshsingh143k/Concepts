package Synchronysed;
class account{
    int balance;
    public account(){
        balance=1000;
    }
    public void withdraw(int val){
        try{
            Thread.sleep(3000);
        }catch(InterruptedException obj){
            
        }
        balance=balance-val;
        System.out.println(balance);
    }

}
class mythread extends Thread{
    account obj;
    public mythread(account tobj){
        obj=tobj;
    }

}

 class classTest {
     public static void main(String[] args) {
         account obj=new account();
         mythread obj1=new mythread(obj);
         mythread obj2=new mythread(obj);
         obj1.start();
         obj2.start();

     }
}

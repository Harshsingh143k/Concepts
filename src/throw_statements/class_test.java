package throw_statements;

public class class_test {
    public static void m1() throws InterruptedException{
        m2();
        System.out.println("hello i am inside m1 method");
    }
    public static void m2() throws InterruptedException {
        System.out.println("hello i am inside m2 methode");
        Thread.sleep(3000);

    }

    public static void main(String[] args) throws InterruptedException {
        m1();
        m2();
        System.out.println("hello i am inside main method");
    }

}

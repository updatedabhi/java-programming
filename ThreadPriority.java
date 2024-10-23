class MyThread4 extends Thread {
    MyThread4(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 34;
        System.out.println("Thank you" + );
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        MyThread4 t1 = new MyThread4("Abhishek");
        t1.start();
    }
}

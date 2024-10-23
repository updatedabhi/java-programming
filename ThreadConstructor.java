class MyThread3 extends Thread {
    public MyThread3(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("I am thread");
            i++;
        }
    }
}

public class ThreadConstructor {
    public static void main(String[] args) {
        MyThread3 t = new MyThread3("Abhishek");
        t.start();
        System.out.println("The id of the thread is " + t.threadId());
        System.out.println("The name of the thread is " + t.getName());
    }
}

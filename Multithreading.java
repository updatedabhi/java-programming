class MyThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("My thread1 is running");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("My thread2 is running");
            i++;
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread2 myThread2 = new MyThread2();
        myThread.start();
        myThread2.start();
    }
}

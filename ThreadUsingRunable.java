class MyThreadRunable1 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("I am thread 1");
            i++;
        }
    }
}

class MyThreadRunable2 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("I am thread 2");
            i++;
        }
    }
}

public class ThreadUsingRunable {
    public static void main(String[] args) {
        MyThreadRunable1 t1 = new MyThreadRunable1();
        MyThreadRunable2 t2 = new MyThreadRunable2();
        Thread T1 = new Thread(t1);
        Thread T2 = new Thread(t2);
        T1.start();
        T2.start();

    }
}
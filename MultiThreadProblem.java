package multithread;

class FirstProgram extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
}

class SecondProgram extends Thread {
    @Override
    public void run() {
        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i = i + 2;
        }
    }
}

public class MultiThreadProblem {
    public static void main(String[] args) {
        FirstProgram t1 = new FirstProgram();
        SecondProgram t2 = new SecondProgram();
        t1.start();
        t2.start();
    }
}
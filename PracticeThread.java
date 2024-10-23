class FirstTask extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.fillInStackTrace();
            }
            System.out.println("Good morning!");
            i++;
        }
    }
}

class SecondTask extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Welcome");
            i++;
        }
    }
}

public class PracticeThread {
    public static void main(String[] args) {
        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        t1.start();
        t2.start();
    }
}

package exception;

import java.util.*;
import java.io.*;

/*
class ExampleArithmeticException {
    public void add() {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first: ");
        a = sc.nextInt();
        System.out.print("Enter second: ");
        b = sc.nextInt();
        try {
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Code is finished");
    }
}


class ExampleArrayOutOfBoundException {
    public void result() {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 6;
        marks[2] = 8;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array index: ");
        int ind = sc.nextInt();
        System.out.print("Enter divisor: ");
        int d = sc.nextInt();
        try {
            int r = marks[ind] / d;
            System.out.print("result: " + r);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

class NestedTryCatch {
    public void check() {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 6;
        marks[2] = 8;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array index: ");
        int ind = sc.nextInt();
        System.out.print("Enter divisor: ");
        int d = sc.nextInt();
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        try {
            try {
                int s = a / b;
                System.out.print("division: " + s + "\n");
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            System.out.println("Division is performed");
            int r = marks[ind] / d;
            System.out.print("result: " + r + "\n");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("code is finished after executing arrya problem");
    }
}

class ExampleCompileTimeException {
    void test() {
        FileInputStream f = new FileInputStream("abhi.txt");
        // System.out.println(354 / 0);
    }
}


class FirstTryCatch {
    public void test() {
        try {
            System.out.println("Abhishek");
            System.out.println("Manish");
            int a = 12, b = 0;
            System.out.println("Rohan");
            System.out.println(a / b);
            System.out.println("Ashutosh");
        } catch (ArithmeticException e) {
            // System.out.println(e);
            // e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("Handled");
        }
        System.out.println("Abhishek Your code at end point");
    }
}


class FinalyBlock {
    public void test() {
        try {
            int a = 34 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Abhishek is good boy");
        }
    }

    public void test2() {
        try {
            System.out.println(34 / 0);
        } finally {
            System.out.println("Abhishek is bad boy");
        }
        System.out.println("Hello good morning");
    }
}

class SecondTryCatch {
    public void test() {
        try {
            // System.out.println(34 / 0);
            int[] arr = new int[3];
            arr[0] = 1;
            arr[1] = 2;
            arr[2] = 3;
            System.out.println(arr[2] / 0);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}


class ThrowTest extends RuntimeException {
    ThrowTest(String msg) {
        super(msg);
    }
}

class Voting {
    void test() {
        int age = 2;
        try {
            if (age < 18) {
                throw new ThrowTest("You are not eligible");
                // compile time error if you write any thing below this statement
            } else {
                System.out.println("You can vote");
            }
        } catch (Exception e) {
            // System.out.println(e);
            e.printStackTrace();
        }

    }
}


class ThrowsTest {
    void test() throws FileNotFoundException {
        FileInputStream f = new FileInputStream("abhi.txt");
    }
}

*/

public class ExceptionHandling {
    public static void main(String[] args) {
        // ExampleArithmeticException obj = new ExampleArithmeticException();
        // ExampleArrayOutOfBoundException obj = new ExampleArrayOutOfBoundException();
        // NestedTryCatch obj = new NestedTryCatch();
        // obj.check();
        // ExampleCompileTimeException obj = new ExampleCompileTimeException();
        // FirstTryCatch obj = new FirstTryCatch();
        // FinalyBlock obj = new FinalyBlock();
        // obj.test2();
        // SecondTryCatch obj = new SecondTryCatch();
        // Voting obj = new Voting();
        /*
         * ThrowsTest obj = new ThrowsTest();
         * try {
         * obj.test();
         * } catch (FileNotFoundException e) {
         * System.out.print("File nhi h isliye " + e);
         * }
         */

    }
}

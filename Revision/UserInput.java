import java.util.*;

class Calculation {
  int n1, n2;
  Calculation(int n1, int n2) {
    this.n1 = n1;
    this.n2 = n2;
  }

  int add() {
    return n1 + n2;
  }
}

public class UserInput {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      /* 
        
        System.out.print("What is your name: ");
        String name = scanner.nextLine();
        
        System.out.print("How old are you?: ");
        int age = scanner.nextInt(); 
        
        scanner.nextLine();
        
        System.out.println("Hello Mr. " + name + ", and you are " + age + " years old.");

        System.out.println("Yes this is possible: " + name + age);
        
        scanner.close(); // Close the scanner
        */

        System.out.print("Enter first number: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int n2 = scanner.nextInt();

        Calculation calculation = new Calculation(n1, n2);
        System.out.println(calculation.add());
    }
}

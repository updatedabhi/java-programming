abstract class ATM {
  // Abstract methods - no implementation here
  public abstract void withdrawMoney(double amount);
  public abstract void depositMoney(double amount);
  
  // Non-abstract method with implementation
  public void checkBalance() {
      System.out.println("Checking account balance...");
  }
}

// Concrete class implementing the abstract methods
class BankATM extends ATM {
  private double balance = 1000.00;  // Initial balance
  
  @Override
  public void withdrawMoney(double amount) {
      if (amount <= balance) {
          balance -= amount;
          System.out.println("Successfully withdrew: $" + amount);
          System.out.println("Remaining balance: $" + balance);
      } else {
          System.out.println("Insufficient balance!");
      }
  }
  
  @Override
  public void depositMoney(double amount) {
      balance += amount;
      System.out.println("Successfully deposited: $" + amount);
      System.out.println("New balance: $" + balance);
  }
}

public class AbstractionExample {
  public static void main(String[] args) {
    ATM myATM = new BankATM();  // Creating an object of BankATM (concrete class)
        
        myATM.checkBalance();  // Accessing non-abstract method
        myATM.depositMoney(500);  // Depositing money
        myATM.withdrawMoney(200);  // Withdrawing money
        myATM.withdrawMoney(1500);
  }
}

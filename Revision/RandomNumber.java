import java.util.Random;

public class RandomNumber {
  public static void main(String[] args) {
    Random random = new Random();
    
    // It will generate random number between 1 to 10
    int x = random.nextInt(10) + 1; 

    double y = random.nextDouble();

    boolean z = random.nextBoolean();



    // System.out.printf("%.2f", y);
    System.out.println(z);
  }
}

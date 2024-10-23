import java.util.Random;

class DiceRoller {
  /*
  DiceRoller() {
    Random random = new Random();
    int number = 0;
    roll(random, number);
  }
  void roll(Random random, int number) {
    number = random.nextInt(6) + 1;
    System.out.println(number);
  }
  */
  
  // the wonder of instance variable
  Random random;
  int number;
  DiceRoller() {
    this.random = new Random();
    roll();
  }
  void roll() {
    number = random.nextInt(6) + 1;
    System.out.println(number);
  }
}

public class InstanceVSLocalVariable {
  public static void main(String[] args) {
    DiceRoller diceRoller = new DiceRoller();
  }
}

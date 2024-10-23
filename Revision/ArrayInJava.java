
public class ArrayInJava {
  public static void main(String[] args) {
    String[] cars = {"Camaro", "Mercedez", "ferari"};

    // Exception arrayIndexOutOfBoundException
    // System.out.println(cars[4]); 

    for (String it : cars) {
      System.out.print(it + ' ');
    }
    System.out.println();

    // Additional way of creating array in java
    String[] names = new String[4];
    names[0] = "Abhishek";
    names[1] = "Sangam";
    names[2] = "Puneet";
    names[3] = "Takeshi";

    for (int i = 0; i < names.length; i++) {
      System.out.print(names[i] + ' ');
    }

    System.out.println();

    int[] nums = new int[3];
    nums[0] = 3;
    for (int it : nums) {
      System.out.println(it);
    }
  }
}

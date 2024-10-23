public class TwoDArray {
  public static void main(String[] args) {
    String[][] cars = new String[3][3];

    cars[0][0] = "Mustang";
    cars[0][1] = "BMW";
    cars[0][2] = "Camaro";

    cars[1][0] = "Silverado";
    cars[1][1] = "Ranger";
    cars[1][2] = "Ferrari";

    cars[2][0] = "Lambo";
    cars[2][1] = "Tesla";
    cars[2][2] = "F-150";

    for (int i = 0; i < cars.length; i++) {
      for (int j = 0; j < cars.length; j++) {
        System.out.print(cars[i][j] + "\t");
      }
      System.out.println();
    }
  }
}

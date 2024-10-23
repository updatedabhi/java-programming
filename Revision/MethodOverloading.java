public class MethodOverloading {
  public static void main(String[] args) {
    System.out.println(add(3, 0));
    System.out.println(add(3, 3, 9));
    System.out.println(add(3, 3, 9, 9));
    System.out.println(add(33.3, 3.9));
  }

  static int add(int a, int b ) {
    return a + b;
  }

  static int add(int a, int b, int c) {
    return a + b + c;
  }

  static int add(int a, int b, int c, int d) {
    return a + b + c + d;
  }

  static double add(double a, double b) {
    return a + b;
  }
}

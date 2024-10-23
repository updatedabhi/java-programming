class Car {
  String make = "Chevrolet";
  String model = "Corvtte";
  int year = 2024;
  String color = "blue";
  double price = 3424302.434;

  void drive() {
    System.out.println("You drive the car");
  }

  void brake() {
    System.out.println("You step on the break");
  }
}

// Four pillar of oops:
// 1. Inheritance
// 4. polymorphism
// 2. encanpsulation
// 3. abstraction


public class OOPS {
  public static void main(String[] args) {
    Car car = new Car();
    car.drive();
  }
}

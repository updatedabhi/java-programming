/*
In short, encapsulation focuses on hiding data, while abstraction focuses on hiding implementation details.
*/ 

// encapsulation
class Car {
  private String model;
  public String getMode() {
    return this.model;
  }

  public void setMode(String model) {
    this.model = model;
  }
}

// abstraction
abstract class Vehicle {
  abstract void start();
}

class Bike extends Vehicle {
  @Override
  void start() {
    System.out.println("Bike starts with kick");;
  }
}

public class AbstractionVSEncapsulation {
  public static void main(String[] args) {
    Bike mt15 = new Bike();
    mt15.start();
  }
}

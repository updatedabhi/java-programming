interface Animal {
  void makeSound();

}

class Dog implements Animal {
  @Override
  public void makeSound() {
    System.out.println("Dog barks");
  }
}

class Pitbull extends Dog {
  void details() {
    System.out.println("Hello I am Pitbull Dog.");
  }
}

public class Interface {
  public static void main(String[] args) {
    Pitbull pitbull = new Pitbull();
    pitbull.makeSound();
  }
}

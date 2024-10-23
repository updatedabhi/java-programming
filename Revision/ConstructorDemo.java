class Human {
  String name; int age; double weight;
  Human(String name, int age, double weight) {
    this.name = name;
    this.age = age;
    this.weight = weight;
  }
  void eat() {
    System.out.println(this.name + " is eating.");
  }
  void drink() {
    System.out.println(this.name + " is drinking.");
  }
}

public class ConstructorDemo {
  public static void main(String[] args) {
    Human h1 = new Human("Abhishek", 34, 3.4);
    Human h2 = new Human("Morty", 64, 90.4);
    h1.eat();
    h2.drink();
  }
}

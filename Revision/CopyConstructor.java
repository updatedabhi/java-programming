class Example1 {
  int age;
  String name;
  Example1(int age, String name) {
    this.age = age;
    this.name = name;
  }

  Example1(Example1 obj) {
    this.age = obj.age;
    this.name = obj.name;
  }

  void display() {
    System.out.println("My name is " + name + " and I am " + age + " years old");
  }
}

public class CopyConstructor {
  public static void main(String[] args) {
    Example1 example1 = new Example1(13, "Abhishek");
    Example1 example2 = new Example1(34, "Yamada");
    example1.display();
    example2.display();
    System.out.println(example1 == example2);

    Example1 example3 = new Example1(89, "Takeshi");
    Example1 example4 = new Example1(example3);

    example3.display();
    example4.display();
  }
}
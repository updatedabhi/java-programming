// Having more than one constructor inside class with different parameter.

class Student{
  String name;
  int regnumber;
  int age;
  char section;

  Student() {
    System.out.println("New admission");
  }

  Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  Student(String name, int age, int regnumber) {
    this.name = name;
    this.age = age;
    this.regnumber = regnumber;
  }

  Student(String name, int regnumber, int age, char section) {
    this.name = name;
    this.regnumber = regnumber;
    this.age = age;
    this.section = section;
  }

  void details() {
    System.out.println("Name: " + name + "\nRegisration no: " + regnumber + "\nAge: " + age + "\nSection: " + section);
  }
  
}

public class ConstructorOverload {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.details();
  }
}

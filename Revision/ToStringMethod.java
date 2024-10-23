class Employee {
  String name = "Abhishek", role = "Java Developer";
  int id = 3, age = 22;

  public String toString() {
    return name + "\n" + age + "\n" + id + "\n" + role;
  }
}

public class ToStringMethod {
  public static void main(String[] args) {
    Employee employee = new Employee();

    // implicitly call employee.toString()
    System.out.println(employee);

    // here explicitly call toString() method
    System.out.println(employee.toString());

    // System.out.println(employee.name);
    // System.out.println(employee.age);
    // System.out.println(employee.role);
    // System.out.println(employee.id);
  }
}

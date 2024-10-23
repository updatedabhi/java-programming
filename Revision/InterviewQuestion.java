import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
// 1. Difference between == and .equals method

class CommparingObject  {
  String name1 = new String("Abhishek");
  String name2 = new String("abhishek");

  String name3 = "Sonam";
  String name4 = "Sonam";

  // comparing with inbuilt method equals
  boolean checkContent() {
    return name1.equals(name2);
  }

  // comparing with == 
  boolean checkReferance() {
    return name3 == name4;
  }
}

// 2. Can we overide static method?

class Person {
  String qualification, name;
  int age;
  Person(String name, String qualification, int age) {
    this.name = name;
    this.qualification = qualification;
    this.age = age;
  }
  void introduction() {
    System.out.println("Hello My name is " + name + " and I am " + age + " years old" + " and My qualification is " + qualification);
  }
  static void greet() {
    System.out.println("Hello, Welcome!");
  }
}

class FirstPerson extends Person {
  String qualification, name, skills;
  int age;
  FirstPerson(String name, String qualification, int age, String skills) {
    super(name, qualification, age);
    this.name = name;
    this.qualification = qualification;
    this.age = age;
    this.skills = skills;
  }
  
  @Override
  void introduction() {
    System.out.println("Hello My name is " + name + " and I am " + age + " years old" + " and My qualification is " + qualification);
    System.out.println("Sills: " + skills);
  }
  
  // This is method hiding
  static void greet() {
    System.out.println("Hello, Welcome from first person");
  }
}


// checked and unchecked exception in java

class CheckedExecption {
  CheckedExecption() {
    try {
      FileReader file = new FileReader("./abhi.txt");
      BufferedReader inputFile = new BufferedReader(file);
      System.out.println(inputFile.readLine());
    } catch(IOException e) {
      System.out.println(e.getMessage());
    }
  }
}

class UncheckedExecption {
  int[] arr;
  int size;
  UncheckedExecption(int[] arr, int size) {
    this.arr = arr;
    this.size = size;
  }
  
  void traverse() {
    for (int i = 0; i <= size; i++) {
      System.out.print(arr[i] + ' ');
    }
  }

  /*
  java.lang.Throwable
    ├── java.lang.Error
    └── java.lang.Exception
         ├── java.lang.RuntimeException  (Unchecked exceptions)
         │      ├── NullPointerException
         │      ├── ArrayIndexOutOfBoundsException
         │      └── ... (other unchecked exceptions)
         └── (Checked exceptions)
                ├── IOException
                ├── SQLException
                └── ... (other checked exceptions)
  */
}

// convert array to list
class ArrayToListConversion {
  ArrayToListConversion(Integer[] arr) {
    List<Integer> list = Arrays.asList(arr);
    System.out.println("List: " + list);
  }
}

public class InterviewQuestion {
  public static void main(String[] args) {

    Integer[] arr = {3, 5, 9, 2};
    // ArrayToListConversion arrayToListConversion = new ArrayToListConversion(arr);

    System.out.println(3 / 0);

    // CheckedExecption checkedExecption = new CheckedExecption();

    // int arr[] = {1, 5, 8, 9, 2};
    // UncheckedExecption uncheckedExecption = new UncheckedExecption(arr, 5);
    // uncheckedExecption.traverse();

    // Person p1 = new FirstPerson("Abhishek", "BTech", 34, "Java, C++");
    // p1.introduction();
  }
}

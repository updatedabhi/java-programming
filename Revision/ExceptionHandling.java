import java.io.FileNotFoundException;
import java.io.FileReader;

class TryCatch {
  TryCatch() {
    try {
      System.out.println(45 / 0);
    } catch(Exception e) {
      e.printStackTrace();
    }
    System.out.println("Normal code");
    System.out.println(34 + 34);
  }
}

class TryCathFinally {
  // in java finally is keyword is used to defind block of code that executes whether exception occur or not it will execute
  TryCathFinally() {
    try {
      // System.exit(0);
      System.out.println(34 / 0);
    } catch(ArithmeticException e) {
      e.printStackTrace();
    } finally {
      System.out.println("I will execute whether execptin occur or not");
    }
  }
}


// custom exception
class  YoungerAgeException extends RuntimeException {
  YoungerAgeException(String msg) {
    super(msg);
  }
}


// Thow keyword is used to handled custom exception
class ThrowExample {
  int age;
  ThrowExample(int age) {
    this.age = age;  
      if (age < 18) {
        try {
          throw new YoungerAgeException("Your age is less than 18");
        } catch(YoungerAgeException e) {
          System.out.println(e);
        }
      } else {
        System.out.println("Good to go");
      }
  }
}

// Throws keyword:  It informs the caller of a method that this method might throw one or more checked exceptions, which the caller needs to handle.

class FileHandling {
  void readFile() throws FileNotFoundException {
    FileReader fileReader = new FileReader("./abhi.txt");
  }
}

class PerformFileHandling {
  PerformFileHandling() {
    FileHandling fileHandling = new FileHandling();
  try {
    fileHandling.readFile();
  } catch(FileNotFoundException e) {
    System.out.println(e);
  }
  }
}


public class ExceptionHandling {
  public static void main(String[] args) {
    // TryCatch tryCatch  = new TryCatch();
    // TryCathFinally tryCathFinally = new TryCathFinally();
    // System.out.println(tryCathFinally.toString());

    PerformFileHandling performFileHandling = new PerformFileHandling();

  }
}
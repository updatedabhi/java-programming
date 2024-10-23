/* 
In Java, a wrapper class is an object type that encapsulates (or "wraps") a primitive data type. 
Wrapper classes provide a way to treat primitive data types (int, char, double, etc.) as objects, which allows them to be used in places 
where only objects are accepted (like collections). Each primitive type has a corresponding wrapper class in Java.
*/

public class WrapperClass {
  public static void main(String[] args) {
    // autoboxing
    Boolean a = true;
    Character b = '@';
    Integer c = 342;
    Double d = 3.23;
    String e = "Abhi";

    // unboxing
    if (a == true) {
      System.out.println("Hello");
    }
  }
}

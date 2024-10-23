public class HelloWorld {
  int instanceVariable;
  static int staticVariable;
  public static void main(String[] args) {
    System.out.println("Hello");
    Example.doSomething();
    HelloWorld helloWorld = new HelloWorld();
    System.out.println("instance variable: " + helloWorld.instanceVariable);
    System.out.println("static variable: " + HelloWorld.staticVariable);

    // command line argument
    for (String arg : args) {
      System.out.print(arg + ' ');
    }
  }
}

class Example {
  public static void doSomething() {
    System.out.println("Trying to do something");
  }
}
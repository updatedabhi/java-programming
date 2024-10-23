// By default class and their attribute and method have default access specifier.

/*
public: Accessible from anywhere.
protected: Accessible within the same package and subclasses (even if they are in different packages).
private: Accessible only within the same class.
(No modifier): Package-private (default): Accessible only within the same package
*/ 

class DefaultExample {
  int n1, n2;
  DefaultExample(int n1, int n2) {
    this.n1 = n1;
    this.n2 = n2;
  }

  int add() {
    return this.n1 + this.n2;
  }
  int sub() {
    return this.n1 - this.n2;
  }
  int mul() {
    return this.n1 * this.n2;
  }
  int div() {
    return this.n1 / this.n2;
  }
}

class PrivateExample {
  private int n1, n2;
  PrivateExample(int n1, int n2) {
    this.n1 = n1;
    this.n2 = n2;
  }
  int add() {
    return this.n1 + this.n2;
  }
  int sub() {
    return this.n1 - this.n2;
  }
  int mul() {
    return this.n1 * this.n2;
  }
  int div() {
    return this.n1 / this.n2;
  }

}

// 

public class TypesOfAccessSpecifiers {
  public static void main(String[] args) {
    // DefaultExample defaultExample = new DefaultExample(3, 2);
    // System.out.println(defaultExample.add());
    // System.out.println(defaultExample.sub());

    PrivateExample privateExample = new PrivateExample(3, 5);
    System.out.println(privateExample.add());
  }
}
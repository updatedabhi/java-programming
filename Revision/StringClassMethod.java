public class StringClassMethod {
  public static void main(String[] args) {
    /* 
    String firstName = new String("Abhishek");
    String myName = new String("Abhishek");
    String lastName = "Gupta";
    String surname = "Gupta";
    System.out.println(lastName == surname);
    System.out.println(firstName == myName);
    */

    String name = "     Abhishek";

    // boolean result = name.equalsIgnoreCase("abhishek");
    // int result = name.length();
    // char result = name.charAt(0);
    // int result = name.indexOf("k");
    // boolean result = name.isEmpty();
    // String result = name.toUpperCase();
    // String result = name.toLowerCase();
    // String result = name.trim();
    // String result = name.replace('k', 'q');

    String text = "Abhishek is good boy and he is beautiful too";
    text = text.replace("beautiful", "handsome");


    System.out.println(text);
  }
}

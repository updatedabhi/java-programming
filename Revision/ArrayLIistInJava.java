import java.util.ArrayList;

// ArrayList: Not synchronized, meaning it is not thread-safe. Multiple threads can access and modify it simultaneously, which can lead to unexpected behavior if not managed properly.
// Vector: Synchronized, making it thread-safe. All methods of Vector are synchronized, which means only one thread can access a method at a time. This can lead to performance overhead due to the additional synchronization.


class TwoDArrayList {
  ArrayList<String> bakery = new ArrayList<>();
  ArrayList<ArrayList<String>> groceryList = new ArrayList<>(); // Class-level declaration

  // Constructor to initialize the bakery and groceryList
  public TwoDArrayList() {
      bakery.add("Cake");
      bakery.add("Donuts");

      // Add the bakery list to groceryList
      groceryList.add(bakery);
  }

  // Method to display the groceryList
  public void displayGroceryList() {
      for (ArrayList<String> list : groceryList) {
          System.out.println(list.get(0));
      }
  }
}


public class ArrayLIistInJava {
  public static void main(String[] args) {

    TwoDArrayList twoDArrayList = new TwoDArrayList();
    twoDArrayList.displayGroceryList();

    /* 
    // it is resizable elements can be add and remove after compilation phase
    ArrayList<String> food = new ArrayList<String>();
    food.add("Pizza");
    food.add("Pasta");
    food.add("Noodles");
    food.add("Khichari");

    food.set(0, "sushi");
    food.remove(2);
    food.clear();

    for (int i = 0; i < food.size(); i++) {
      System.out.println(food.get(i));
    }
    */
  }
}

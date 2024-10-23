package collection;

import java.util.*;

public class Collection {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(6);
        l1.add(4);
        l1.add(5);
        l1.add(9);
        System.out.println(l1.get(3));
        l1.add(4, 9);
        System.out.println(l1);
    }
}
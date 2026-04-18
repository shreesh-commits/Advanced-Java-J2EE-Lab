// 1.a Write a Java program to add elements into ArrayList and LinkedList
// and perform different operations on them.

import java.util.*;

public class Program1A {

    public static void main(String[] args) {

        ArrayList<String> a1 = new ArrayList<String>();
        LinkedList<String> l1 = new LinkedList<String>();

        // adding elements
        a1.add("Apple");
        a1.add("Banana");
        a1.add("Orange");

        l1.add("Apple");
        l1.add("Banana");
        l1.add("Orange");

        System.out.println("ArrayList = " + a1);
        System.out.println("LinkedList = " + l1);

        // adding at specific index
        a1.add(1, "Mango");
        l1.add(1, "Mango");

        // adding multiple elements
        a1.addAll(Arrays.asList("Grapes", "Cherry"));
        l1.addAll(Arrays.asList("Grapes", "Cherry"));

        System.out.println("\nAfter adding more items");
        System.out.println(a1);
        System.out.println(l1);

        // accessing
        System.out.println("\nFirst item in ArrayList : " + a1.get(0));
        System.out.println("Second item in LinkedList : " + l1.get(1));

        // updating
        a1.set(2, "Pineapple");
        l1.set(2, "Pineapple");

        System.out.println("\nAfter update");
        System.out.println(a1);
        System.out.println(l1);

        // removing
        a1.remove("Banana");
        l1.remove("Banana");

        System.out.println("\nAfter remove");
        System.out.println(a1);
        System.out.println(l1);

        // searching
        System.out.println("\nApple found in ArrayList : " + a1.contains("Apple"));
        System.out.println("Orange found in LinkedList : " + l1.contains("Orange"));

        // size
        System.out.println("\nSize of ArrayList : " + a1.size());
        System.out.println("Size of LinkedList : " + l1.size());

        // using for each loop
        System.out.println("\nArrayList items");
        for(String x : a1)
        {
            System.out.println(x);
        }

        // using iterator
        System.out.println("\nLinkedList items using Iterator");
        Iterator<String> it = l1.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        // sorting
        Collections.sort(a1);
        Collections.sort(l1);

        System.out.println("\nAfter sorting");
        System.out.println(a1);
        System.out.println(l1);

        // sublist
        System.out.println("\nSublist from ArrayList : " + a1.subList(0,2));

        // clearing
        a1.clear();
        l1.clear();

        System.out.println("\nAfter clear");
        System.out.println(a1);
        System.out.println(l1);
    }
}
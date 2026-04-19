// 1.c(3) Java program to insert the specified
// element at the end of a linked list using offerLast()

import java.util.*;

public class Program1C3
{
    public static void main(String args[])
    {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        System.out.println("Before adding : " + list);

        list.offerLast("Pink");

        System.out.println("After adding : " + list);
    }
}
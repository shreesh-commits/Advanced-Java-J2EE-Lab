// 1.c(5)  Java program that swaps two elements
// (first and third elements) in a linked list using Collections.swap()

import java.util.*;

public class Program1C5
{
    public static void main(String args[])
    {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("Black");

        System.out.println("Before swap : " + list);

        Collections.swap(list, 0, 2);

        System.out.println("After swap : " + list);
    }
}
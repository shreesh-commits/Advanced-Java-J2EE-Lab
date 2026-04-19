// 1.c(1) Java program to iterate through all elements
// in a linked list starting at the specified position (2nd)
// using iterator

import java.util.*;

public class Program1C1
{
    public static void main(String args[])
    {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("Black");

        Iterator<String> it = list.listIterator(1);

        System.out.println("Elements from 2nd position:");

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
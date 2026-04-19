// 1.c(2) Java program to iterate a linked list
// in reverse order using descendingIterator()

import java.util.*;

public class Program1C2
{
    public static void main(String args[])
    {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("Black");

        Iterator<String> it = list.descendingIterator();

        System.out.println("Elements in reverse order:");

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
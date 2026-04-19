// 1.c(4) Write a Java program to display elements
// and their positions in a linked list using get(p)

import java.util.*;

public class Program1C4
{
    public static void main(String args[])
    {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("Black");

        System.out.println("Elements and Positions:");

        for(int p = 0; p < list.size(); p++)
        {
            System.out.println("Position " + p + " : " + list.get(p));
        }
    }
}
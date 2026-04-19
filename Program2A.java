// 2.a Develop a java program for performing various string operations

import java.util.*;

public class Program2A
{
    public static void main(String args[])
    {
        // String creation
        String s1 = "Hello";
        String s2 = "World";

        System.out.println("String 1 : " + s1);
        System.out.println("String 2 : " + s2);

        // Length and char access
        System.out.println("Length of s1 : " + s1.length());
        System.out.println("First char : " + s1.charAt(0));

        // Comparison
        System.out.println("Equals : " + s1.equals(s2));

        // Searching
        System.out.println("Contains ll : " + s1.contains("ll"));

        // Substring
        System.out.println("Substring : " + s1.substring(1,4));

        // Modification
        System.out.println("Uppercase : " + s1.toUpperCase());
        System.out.println("Lowercase : " + s2.toLowerCase());

        // Whitespace
        String s3 = "   Java   ";
        System.out.println("Trimmed : " + s3.trim());

        // Concatenation
        System.out.println("Join : " + s1 + " " + s2);

        // Splitting
        String fruits = "Apple,Mango,Banana";
        String arr[] = fruits.split(",");

        System.out.println("Split values:");
        for(String x : arr)
        {
            System.out.println(x);
        }

        // StringBuilder
        StringBuilder sb = new StringBuilder("AIET");
        sb.append(" College");
        System.out.println("StringBuilder : " + sb);

        // Formatting
        System.out.printf("Number = %d\n", 100);

        // Email validation
        String email = "student@gmail.com";

        if(email.contains("@") && email.startsWith("student") && email.endsWith(".com"))
            System.out.println("Valid Email");
        else
            System.out.println("Invalid Email");
    }
}
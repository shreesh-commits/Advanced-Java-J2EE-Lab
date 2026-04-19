// 3.a Develop a java program for performing various string operations

import java.util.*;

public class Program3A
{
    public static void main(String args[])
    {
        String s1 = "Java";
        String s2 = "Programming";

        // String creation
        System.out.println("String 1 : " + s1);
        System.out.println("String 2 : " + s2);

        // Length and character access
        System.out.println("Length of s1 : " + s1.length());
        System.out.println("Character at index 2 : " + s1.charAt(2));

        // Comparison
        System.out.println("Equals : " + s1.equals(s2));

        // Searching
        System.out.println("Contains gram : " + s2.contains("gram"));

        // Substring
        System.out.println("Substring : " + s2.substring(0, 7));

        // Modification
        System.out.println("Uppercase : " + s1.toUpperCase());
        System.out.println("Lowercase : " + s2.toLowerCase());

        // Whitespace handling
        String s3 = "   Hello Java   ";
        System.out.println("Trimmed : " + s3.trim());

        // Concatenation
        System.out.println("Joined : " + s1.concat(" " + s2));

        // Splitting
        String data = "Red,Blue,Green";
        String arr[] = data.split(",");

        System.out.println("Split values:");
        for(String x : arr)
        {
            System.out.println(x);
        }

        // StringBuilder demo
        StringBuilder sb = new StringBuilder("AIET");
        sb.append(" College");
        System.out.println("StringBuilder : " + sb);

        // Formatting
        System.out.printf("Value = %d\n", 50);

        // Email validation
        String email = "student@gmail.com";

        if(email.contains("@") && email.startsWith("student") && email.endsWith(".com"))
            System.out.println("Valid Email");
        else
            System.out.println("Invalid Email");
    }
}
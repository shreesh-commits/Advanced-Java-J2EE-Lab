// 1.b(2)Java program for getting different colors through
// ArrayList interface and remove the 2nd element and color "Blue"

import java.util.*;

public class Program1B2
{
    public static void main(String args[])
    {
        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Black");

        System.out.println("Before remove : " + colors);

        // removing 2nd element
        colors.remove(1);

        // removing Blue color
        colors.remove("Blue");

        System.out.println("After remove : " + colors);
    }
}
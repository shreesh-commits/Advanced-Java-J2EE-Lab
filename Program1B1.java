// 1.b(1) java program for getting different colors through
// ArrayList interface and search whether the color "Red" is available or not

import java.util.*;

public class Program1B1
{
    public static void main(String args[])
    {
        ArrayList<String> colors = new ArrayList<String>();

       colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Black");

        System.out.println("Colors are : " + colors);

        if(colors.contains("Red"))
            System.out.println("Red color is available");
        else
            System.out.println("Red color is not available");
    }
}
// 1.b(3) java program for getting different colors through
// ArrayList interface and sort them using Collections.sort()

import java.util.*;

public class Program1B3
{
    public static void main(String args[])
    {
        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Black");

        System.out.println("Before sorting : " + colors);

        Collections.sort(colors);

        System.out.println("After sorting : " + colors);
    }
}
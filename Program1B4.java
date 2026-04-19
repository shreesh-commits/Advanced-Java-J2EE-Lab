// 1.b(4) java program for getting different colors through
// ArrayList interface and extract the 1st and 2nd elements
// from the ArrayList object by using SubList()

import java.util.*;

public class Program1B4
{
    public static void main(String args[])
    {
        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Black");

        System.out.println("Original List : " + colors);

        List<String> sub = colors.subList(0, 2);

        System.out.println("Sub List : " + sub);
    }
}
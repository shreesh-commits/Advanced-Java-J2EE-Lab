// 1.b(5) java program for getting different colors through
// ArrayList interface and delete nth element from the
// ArrayList object by using remove by index

import java.util.*;

public class Program1B5
{
    public static void main(String args[])
    {
        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Black");

        int n = 2;   // deleting 3rd element

        System.out.println("Before delete : " + colors);

        colors.remove(n);

        System.out.println("After delete : " + colors);
    }
}
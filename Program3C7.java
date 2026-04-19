// 3.c Q7 Java Program for shortening a string
// and adding ellipsis using truncate()

public class Program3C7
{
    static String truncate(String str, int len)
    {
        if(str.length() > len)
            return str.substring(0, len) + "...";
        else
            return str;
    }

    public static void main(String args[])
    {
        String s = "Java Programming Language";

        System.out.println("Original String : " + s);
        System.out.println("Truncated : " + truncate(s, 10));
    }
}
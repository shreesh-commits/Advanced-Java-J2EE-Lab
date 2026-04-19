// 3.b Q1 Java Program for checking if a string is null
// or contains only whitespace using isNullOrEmpty()

public class Program3B1
{
    static boolean isNullOrEmpty(String str)
    {
        if(str == null || str.trim().length() == 0)
            return true;
        else
            return false;
    }

    public static void main(String args[])
    {
        String s1 = "   ";
        String s2 = "Java";

        System.out.println("String 1 : '" + s1 + "'");
        System.out.println("Is Null or Empty : " + isNullOrEmpty(s1));

        System.out.println("String 2 : " + s2);
        System.out.println("Is Null or Empty : " + isNullOrEmpty(s2));
    }
}
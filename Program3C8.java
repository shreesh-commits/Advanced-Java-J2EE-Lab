// 3.c Q8 Java Program for checking numeric string
// using isNumeric()

public class Program3C8
{
    static boolean isNumeric(String str)
    {
        for(int i = 0; i < str.length(); i++)
        {
            if(!Character.isDigit(str.charAt(i)))
                return false;
        }

        return true;
    }

    public static void main(String args[])
    {
        String s1 = "12345";
        String s2 = "12A45";

        System.out.println(s1 + " : " + isNumeric(s1));
        System.out.println(s2 + " : " + isNumeric(s2));
    }
}
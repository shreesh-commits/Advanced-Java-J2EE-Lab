// 3.b Q3 Java Program for reversing a string
// using reverseString()

public class Program3B3
{
    static String reverseString(String str)
    {
        String rev = "";

        for(int i = str.length() - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }

        return rev;
    }

    public static void main(String args[])
    {
        String s = "Java";

        System.out.println("Original String : " + s);
        System.out.println("Reversed String : " + reverseString(s));
    }
}
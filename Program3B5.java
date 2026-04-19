// 3.b Q5 Java Program for removing whitespace
// using removeWhitespace()

public class Program3B5
{
    static String removeWhitespace(String str)
    {
        return str.replaceAll("\\s", "");
    }

    public static void main(String args[])
    {
        String s = "Java is easy to learn";

        System.out.println("Original String : " + s);
        System.out.println("After Removing Spaces : " + removeWhitespace(s));
    }
}
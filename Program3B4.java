// 3.b Q4 Java Program for checking palindrome
// using isPalindrome()

public class Program3B4
{
    static boolean isPalindrome(String str)
    {
        str = str.toLowerCase();
        str = str.replaceAll("[^a-z0-9]", "");

        String rev = "";

        for(int i = str.length() - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }

        if(str.equals(rev))
            return true;
        else
            return false;
    }

    public static void main(String args[])
    {
        String s = "Madam";

        System.out.println("String : " + s);

        if(isPalindrome(s))
            System.out.println("It is Palindrome");
        else
            System.out.println("It is Not Palindrome");
    }
}
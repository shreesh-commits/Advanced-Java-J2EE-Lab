// 3.c Q9 Java Program for generating random string
// using generateRandomString()

import java.util.Random;

public class Program3C9
{
    static String generateRandomString(int len)
    {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String result = "";

        Random r = new Random();

        for(int i = 0; i < len; i++)
        {
            int index = r.nextInt(chars.length());
            result = result + chars.charAt(index);
        }

        return result;
    }

    public static void main(String args[])
    {
        System.out.println("Random String : " + generateRandomString(8));
    }
}
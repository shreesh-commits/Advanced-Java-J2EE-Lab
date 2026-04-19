// 3.c Q6 Java Program for capitalizing first letter
// of each word using capitalizeWords()

public class Program3C6
{
    static String capitalizeWords(String str)
    {
        String words[] = str.split(" ");
        String result = "";

        for(int i = 0; i < words.length; i++)
        {
            String w = words[i];

            result = result +
                     Character.toUpperCase(w.charAt(0)) +
                     w.substring(1).toLowerCase() + " ";
        }

        return result.trim();
    }

    public static void main(String args[])
    {
        String s = "java programming language";

        System.out.println("Original String : " + s);
        System.out.println("Capitalized : " + capitalizeWords(s));
    }
}
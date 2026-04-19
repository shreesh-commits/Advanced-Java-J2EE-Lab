// 3.c Q10 Java Program for counting words
// using countWords()

public class Program3C10
{
    static int countWords(String str)
    {
        String words[] = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String args[])
    {
        String s = "Java is easy to learn";

        System.out.println("String : " + s);
        System.out.println("Word Count : " + countWords(s));
    }
}
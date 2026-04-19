// 3.b Q2 Java Program for counting substring occurrences
// using countOccurrences()

public class Program3B2
{
    static int countOccurrences(String mainstr, String sub)
    {
        int count = 0;
        int pos = 0;

        while((pos = mainstr.indexOf(sub, pos)) != -1)
        {
            count++;
            pos = pos + sub.length();
        }

        return count;
    }

    public static void main(String args[])
    {
        String s1 = "Java is good. Java is easy. Java is powerful.";
        String s2 = "Java";

        int result = countOccurrences(s1, s2);

        System.out.println("Main String : " + s1);
        System.out.println("Substring : " + s2);
        System.out.println("Occurrences : " + result);
    }
}
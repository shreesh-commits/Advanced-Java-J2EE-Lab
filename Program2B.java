// 2.b Java program to test performance of
// StringBuffer and StringBuilder

public class Program2B
{
    public static void main(String args[])
    {
        long start, end;

        // StringBuffer
        StringBuffer sb1 = new StringBuffer();

        start = System.currentTimeMillis();

        for(int i = 1; i <= 10000; i++)
        {
            sb1.append("AIET");
        }

        end = System.currentTimeMillis();

        System.out.println("StringBuffer Time : " + (end - start) + " ms");

        // StringBuilder
        StringBuilder sb2 = new StringBuilder();

        start = System.currentTimeMillis();

        for(int i = 1; i <= 10000; i++)
        {
            sb2.append("AIET");
        }

        end = System.currentTimeMillis();

        System.out.println("StringBuilder Time : " + (end - start) + " ms");

        System.out.println("StringBuilder is faster than StringBuffer.");
    }
}
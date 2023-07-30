package Java;

import java.util.Random;

public class GenerateOTP
{
    public static void main(String[] args)
    {
        Random b = new Random();
        int n,i;
        for (i=0;i<6;i++)
        {
            n=b.nextInt(10);
            System.out.print(n);
        }
    }
}

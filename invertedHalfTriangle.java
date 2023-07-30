package Java;
import java.util.Scanner;
public class invertedHalfTriangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(),i,j;
        for (i=n;i>=1;i--)
        {
            for (j=i;j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


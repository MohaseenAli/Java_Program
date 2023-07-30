package Java;
import java.util.Scanner;
public class DoubleHalfTriangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(),i,j;
        for (i=1;i<=n;i++)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i=n-1;i>=1;i--)
        {
            for (j=i;j>=1;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

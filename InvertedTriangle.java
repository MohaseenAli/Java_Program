package Java;
import java.util.Scanner;
public class InvertedTriangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),i,j,k;
        for (i=n;i>=1;i--)
        {
            for (j=n-i;j>=1;j--)
            {
                System.out.print("  ");
            }
            for (k=1;k<=i;k++)
            {
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
}

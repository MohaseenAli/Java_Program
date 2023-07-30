package Java;
import java.util.Scanner;
public class decimalToBinary
{
    public static void main(String[] args)
    {
        int i=0,j=0;
        int [] binary=new int[32];
        Scanner scanner=new Scanner(System.in);
        int decimal= scanner.nextInt();
        while (decimal>0)
        {
            binary[i]=decimal%2;
            decimal=decimal/2;
            i++;
            j++;
        }
        for(i=j+1;i>=0;i--)
        {
            System.out.print(""+binary[i]);
        }
    }
}
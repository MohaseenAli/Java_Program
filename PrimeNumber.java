package Java;
import java.util.Scanner;
public class PrimeNumber
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n' to check weather it is  prime or not :- ");
        int i,m=0,n=sc.nextInt();
        System.out.println();
        if(n==0 || n==1)
        {
            System.out.println(n+" is not a prime number");
        }
        else
        {
            for(i=2;i<(n/2);i++)
            {
                if(n%i==0)
                {
                    m++;
                    break;
                }
            }
            if(m>0)
            {
                System.out.println(n+" is not a prime number");
            }
            else
            {
                System.out.println(n+" is prime number");
            }
        }
    }
}

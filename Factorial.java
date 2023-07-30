package Java;
import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("write a number too find it's factorial :- ");
        int n = sc.nextInt(),i=n,sum=1;
        while (n>0)
        {
            sum *= n;
            n--;
        }
        System.out.println("Factorial of " +i+ " is " +sum );
    }
}

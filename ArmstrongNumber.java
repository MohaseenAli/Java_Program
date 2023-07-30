package Java;
import java.util.Scanner;
public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number too check weather it is armstrong or not :- ");
        int n= sc.nextInt(),sum=0,r,t;
        t=n;
        while (n>0)
        {
            r=n%10;
            sum = sum + r*r*r;
            n=n/10;
        }
        if (sum==t)
        {
            System.out.println(sum+" is a armstrong number");
        }
        else
        {
            System.out.println(t+ " is not an armstrong number");
        }
    }
}

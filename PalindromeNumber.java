package Java;
import java.util.*;
public class PalindromeNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 digit number to check weather it is palindrome or not :- ");
        int n=sc.nextInt(),temp,t,sum=0;
        t=n;
        while(n>0)
        {
            temp=n%10;
            sum = sum*10+temp;
            n=n/10;
        }
        if (t==sum)
        {
            System.out.println(t+" is palindrome number");
        }
        else
        {
            System.out.println(t+" is not a palindrome number");
        }
    }
}

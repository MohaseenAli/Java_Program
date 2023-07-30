package Java;
import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int sum=0 , n = sc.nextInt(),t , r;
        t=n;
        while(n>0)
        {
            r=n%10;
            sum = sum*10+r;
            n=n/10;
        }
        if(sum==t)
        {
            System.out.printf("%d is palindrome number",t);
        }
        else
        {
            System.out.printf("%d is not a palindrome number",t);
        }
    }
}

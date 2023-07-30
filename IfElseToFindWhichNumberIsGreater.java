package Java;
import java.util.Scanner;
public class IfElseToFindWhichNumberIsGreater
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two find which number is greater from a and b");
        int a = sc.nextInt() , b = sc.nextInt();
        if (a>b)
        {
            System.out.printf("%d is greater then %d",a,b);
        }
        else
        {
            System.out.printf("%d is greater then %d",b,a);
        }
    }
}

package Java;
import java.util.Scanner;
public class TooCheckWeatherTheYearIsLeap
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year too check weather it is leap or not");
        int a = sc.nextInt();
        if (a%400==0)
        {
            System.out.println(a+ " is a leap year");
        }
        else if (a%4==0 && a%100!=0)
        {
            System.out.printf("%d is a leap year",a);
        }
        else
        {
            System.out.printf("%d is not a leap year",a);
        }
    }
}

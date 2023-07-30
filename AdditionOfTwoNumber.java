package Java;
import java.util.Scanner;
class AdditionOfTwoNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\n-->enter two number for addition :-  ");
        int a = sc.nextInt(),b = sc.nextInt(),sum=a+b;
        System.out.print("\n\nsum = " +sum);

    }
}
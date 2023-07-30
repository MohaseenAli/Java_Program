package Java;
import java.util.Scanner;
public class MultiplicationOfTwoNumber
{
    public static void main(String [] args)
    {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter two number for addition :- ");
        int a= S.nextInt(),b=S.nextInt(), mult=a*b;
        System.out.println("\n\n==> Multiplication = "+mult);
    }
}

package Java;
import java.util.Scanner;
public class TwoCalculatePercentage
{
    public static void main(String[] args)
    {
        System.out.println("\n\n---TWO CALCULATE PERCENTAGE OF 5 SUBJECTS---\n\n");
        Scanner S = new Scanner(System.in);
        System.out.print("enter 5 subject marks :- ");
        float a = S.nextFloat();
        float b = S.nextFloat();
        float c = S.nextFloat();
        float d = S.nextFloat();
        float e = S.nextFloat();
        float p = (a + b + c + d + e) * 100 / 500;
        System.out.print("\n\n-->Percentage = " + p);
    }
}
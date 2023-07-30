package Java;

import java.util.Scanner;
class DivisionOfTwoNumber
{
    public static void main(String[] args)
    {
        Scanner S= new Scanner(System.in);
        System.out.print("enter two number for division :- ");
        float a=S.nextFloat(),b= S.nextFloat(),division=a/b;
        System.out.println("\ndivision = " +division);
    }
}

package Java;
import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args)
    {
        System.out.println("<-------- CALCULATOR -------->");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number :- ");
        int  a=sc.nextInt(),b=sc.nextInt(),c;
        float d;
        System.out.print("""
                            enter your choice :- (1) ADDITION
                                                 (2) SUBTRACTION
                                                 (3) MULTIPLICATION
                                                 (4) DIVISION
                                                 
                            ==> Your Choice is\s""");
        int n=sc.nextInt();
        switch (n)
        {
            case 1 -> {
                c = a+b;
                System.out.println("Addition = " + c);
            }

            case 2 -> {
                c = a-b;
                System.out.println("Subtraction = " + c);
            }

            case 3 -> {
                c = a*b;
                System.out.println("Multiplication = " + c);
            }

            case 4 -> {
                d = (float) a/b;
                System.out.println(" Division = " + d);
            }
        }
    }
}

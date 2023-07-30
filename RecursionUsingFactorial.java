package Java;

public class RecursionUsingFactorial
{
    static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args)
    {
        int a=5;
        System.out.printf("Factorial of %d is %d ",a,fact(a));
        System.out.printf("\n\nFactorial of 6 is %d ",fact(6));
    }
}

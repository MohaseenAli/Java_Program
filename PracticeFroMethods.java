package Java;
//import java.util.Scanner;
public class PracticeFroMethods
{
/*
    1). Print Multiplication table using METHODS
    static void mul(int n)
    {
        int i,sum;
        for(i=1;i<=10;i++)
        {
            sum =n*i;
            System.out.printf("\n%d X %d = %d",n,i,sum);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find its multiplication table :- ");
        int a=sc.nextInt();
        mul(a);
    }
*/

/*
    2). To print star pattern using methods
    static void star(int n)
    {
        int i,j;
        {
            for (i=0;i<=n;i++)
            {
                for(j=0;j<i;j++)
                {
                    System.out.printf("* ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args)
    {
        star(5);
    }
*/

/*
    3).  Recursive function to calculate sum of n natural no.
    static int sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            return n+sum(n-1);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Sum of first 10 natural number is "+sum(10));
    }
*/
/*
    4). To print star pattern using methods
    static void star(int n)
    {
        int i,j;
        {
            for (i=n;i>0;i--)
            {
                for(j=0;j<i;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args)
    {
        star(5);
    }
*/


//    5). Fibonacci series using recursion
    static int fibo(int n)
    {
        if(n==1)
        {
            return 0;
        }
        else if(n==2)
        {
            return 1;
        }
        else
        {
            return fibo(n-2)+fibo(n-1);
        }
    }

    public static void main(String[] args)
    {
        int i;
        System.out.println("==> Fibonacci series upto 10 terms");
        for (i=1;i<=10;i++)
        {
            System.out.print(fibo(i)+" ");
        }
        System.out.print("\n\n==> 10th term of fibonacci series is ");
        System.out.println(fibo(10));
    }
}

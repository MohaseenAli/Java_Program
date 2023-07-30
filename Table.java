package Java;
import java.util.Scanner;
public class Table
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to find it's table :- ");
        int n=sc.nextInt(),i;
        for(i=1;i<=10;i++)
        {
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
    }
}

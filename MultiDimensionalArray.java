package Java;
import java.util.Scanner;
public class MultiDimensionalArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a & b for matrix (axb) :- ");
        int a = sc.nextInt() , b = sc.nextInt() ;
        int [][]array = new int [a][b];
//        int i,j;
        for (int i=0 ; i<a ; i++)
        {
            for (int j=0 ; j<b ; j++)
            {
                System.out.printf("\n\nEnter element for matrix at index '%d' '%d' :- ",i,j);
                array[i][j] = sc.nextInt();
            }
        }
        System.out.printf("\n\n==> 2-D Matrix %dx%d is \n\n",a,b);
        for (int i=0 ; i<a ; i++)
        {
            for (int j=0 ; j<b ; j++)
            {
                System.out.printf("%d  ",array[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n\nElement in matrix with index");
        for (int i=0 ; i<a ; i++)
        {
            for (int j = 0; j < b; j++)
            {
                System.out.printf("\n\n==> Element in matrix at index %d,%d is %d",i,j,array[i][j]);
            }
        }
    }
}

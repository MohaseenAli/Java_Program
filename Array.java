package Java;
import java.util.*;
public class Array
{
    public static void main(String[] args)
    {
/*
      ==>  Three ways too create array in java :-
      1).  int []marks = new int[5];
           System.out.println(marks.length);
      2).  int[] sub ;
           sub = new int[7];
      3).  int [] no = {11,32,55,32,54,};
           float [] no = {11.5f,32.0f,55.55f,32.6f,54.5f};
           System.out.println(no[3]);

        int [] marks = {11,32,55,32,54,};
        int  i;
        for (i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
        int [] marks = {11,32,55,32,54,};
        for (int i:marks)
        {
            System.out.println(i);
        }
 */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of marks you want :- ");
        int n = sc.nextInt(),i;
        int[] marks = new int[n];
        for(i=0 ; i<n ; i++)
        {
            System.out.print("\nEnter array element for index " +i+ " :- ");
            marks [i] = sc.nextInt();
        }
        for(i=0 ; i<n ; i++)
        {
            System.out.println("\nMarks at index "+i+" is " +marks[i]);
        }
        Arrays.sort(marks);
        System.out.println("Sorted arrays are");
        for(i=0 ; i<n ; i++)
        {
            System.out.print(marks[i]+" ");
        }
    }
}

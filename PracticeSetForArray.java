package Java;
//import java.util.Scanner;
public class PracticeSetForArray
{
    public static void main(String[] args)
    {
//      1).  make an array of 5 float ane do its sum
//        float [] a = {12.453f,24.6436f,3.634f,74.0f,0.547427f};
//        float sum=0;
//        for (int i=0 ; i<5 ; i++)
//        {
//            sum=sum+a[i];
//        }
//        System.out.println("sum = "+sum);

//      2).  To check given no. is present in array or not
//        int []b = {1,22,76,90,3,6,10,11};
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a no. to check weather the no. is exist in give array :- ");
//        int n = sc.nextInt();
//        boolean a = false;
//        for (int i=0 ; i<8 ; i++)
//        {
//            if(b[i]==n)
//            {
//                 a=true ;
//                break;
//            }
//        }
//        if(a)
//        {
//            System.out.println("The given no. is exist in array");
//        }
//        else
//        {
//            System.out.println("Given no. does not exist in array");
//        }

//     3).  Calculate average marks of all student physics using for-each loop
//        int []c ={89,67,70,35,58};
//        int sum=0;
//        float avg;
//        for (int i:c)
//              {
//                  sum = sum + i;
//              }
//        avg = (float)sum/5;
//        System.out.println("Average marks of 5 student in physics is "+avg);

//      4).  Addition of two matrix
//        int [][]a = new int[2][3];
//        int [][]b = new int[2][3];
//        int [][]c = new int[2][3];
//        a[0][0]=1;
//        a[0][1]=2;
//        a[0][2]=3;
//        a[1][0]=4;
//        a[1][1]=5;
//        a[1][2]=6;
//        b[0][0]=5;
//        b[0][1]=9;
//        b[0][2]=2;
//        b[1][0]=4;
//        b[1][1]=7;
//        b[1][2]=3;
//        for (int i=0 ; i<2 ;i++)
//        {
//            for (int j=0 ; j<3 ;j++)
//            {
//                c[i][j]= a[i][j]+b[i][j];
//            }
//        }
//        System.out.println("\n\n==> Addition of two matrix 2x3 are");
//        for (int i=0 ; i<2 ;i++)
//        {
//            for (int j=0 ; j<3 ;j++)
//            {
//                System.out.printf("%d  ",c[i][j]);
//            }
//            System.out.println();
//        }

//     6).  find maximum in array
//        int []b = {1,22,736,90,3,6,10,11};
//        int max=b[0];
//        for (int e:b)
//        {
//            if (e>max)
//            {
//                max=e;
//            }
//        }
//        System.out.println("maximum from array is "+max);

//        7).  find minimum in array
//        int []b = {345,22,736,90,3,6,10,11};
//        int min=b[0];
//        for (int e:b)
//        {
//            if (e<min)
//            {
//                min=e;
//            }
//        }
//        System.out.println("maximum from array is "+min);

//        8).  Given array is sorted or not
        int []b = {1,2,3,4,5,10,11,9};
        boolean c = true;
        for (int i=0 ; i<7 ; i++)
        {
            if (b[i]>b[i+1])
            {
                c = false;
                break;
            }
        }
        if (c)
        {
            System.out.println("Given array is sorted");
        }
        else
        {
            System.out.println("Given array is not sorted");
        }
    }
}

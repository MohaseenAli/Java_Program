package Java;

public class VarArg
{
    static int sum (int...arr)
    {
        int s=0;
        for (int a:arr)
        {
            s+=a;
        }
        return s;
    }

    public static void main(String[] args)
    {
        System.out.println("Sum of the number is :- "+sum(1,2,3,4));
        System.out.println("Sum of the number is :- " +  sum(4,6,34,2,5,9));
    }
}

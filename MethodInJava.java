package Java;

public class MethodInJava
{
     static int sub(int x , int y)
    {
        int z;
        if(x>y)
        {
            z=x-y;
            System.out.printf("%d-%d=%d\n",x,y,z);
        }
        else
        {
            z=y-x;
            System.out.printf("\n\n%d-%d=%d\n",y,x,z);
        }
        return z;
    }

    public static void main(String[] args)
    {
        int a=10 , b=5 , c = sub(a, b);
        System.out.println(c);
//        Method invocation using object creation (When u not use Static keyword)
//        MethodInJava obj = new MethodInJava();
//        c = obj.sub (a,b)
        int a1=5 , b1=15 , c1 = sub(a1,b1);
        System.out.println(c1);
    }
}


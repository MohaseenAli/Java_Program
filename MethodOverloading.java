package Java;
public class MethodOverloading
{
    static void max(int a, int b)
    {
        System.out.printf("Maximum from %d & %d is %d\n\n", a, b, Math.max(a,b));
    }
    static void max(float a, float b)
    {
        System.out.printf("Maximum from %f & %f is %f\n\n", a, b, Math.max(a,b));
    }
    static void max(int a, int b, int c)
    {
        if (a>b)
        {
            System.out.printf("Maximum from %d ,%d & %d is %d\n\n", a, b, c, Math.max(a,c));
        }
        else
        {
            System.out.printf("Maximum from %d ,%d & %d is %d\n\n", a, b, c, Math.max(b,c));
        }
    }

    public static void main(String[] args)
    {
        int x=10, y=9;
        max(x,y);
        int  x1=23 , y1=32 , z1=222 ;
        max(x1,y1,z1);
        float x2=11.0223f, y2=11.0233f;
        max(x2,y2);
        max(2.3f,3.4f);
    }
}

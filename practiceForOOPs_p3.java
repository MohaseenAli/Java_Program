package Java;
class rectangle
{
    int a,b;
    public int area1()
    {
        return a*b;
    }
    public int perimeter1()
    {
        return 2*(a+b);
    }
}
public class practiceForOOPs_p3
{
    public static void main(String[] args)
    {
        rectangle l = new rectangle();
        l.a=3;
        l.b=4;
        System.out.println("Perimeter of rectangle having length '"+l.a+"' & breadth '" +l.b+"' is '" +l.perimeter1()+"'");
        System.out.println("Area of rectangle having length '"+l.a+"' & breadth '" +l.b+"' is '" +l.area1()+"'");
    }
}

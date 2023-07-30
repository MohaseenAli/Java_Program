package Java;
class circle
{
    float r;
    public float area2()
    {
        return (float) (3.14*r*r);
    }
    public float perimeter2()
    {
        return (float) (2*3.14*r);
    }

    protected void area() {
    }
}
public class practiceForOOPs_p4
{
    public static void main(String[] args)
    {
        circle a = new circle();
        a.r =12;
        System.out.println("Perimeter of circle having radius '" +a.r+ "' is '" +a.perimeter2()+"'");
        System.out.println("Area of circle having radius '" +a.r+ "' is '" +a.area2()+"'");
    }
}

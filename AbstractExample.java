package Java;
import java.util.Scanner;
abstract class Shape
{
    abstract public void area();
    abstract public void circumference();
}
class CircleForAbstract extends Shape
{
    int r;
    Scanner sc = new Scanner(System.in);
    @Override
    public void area()
    {
        System.out.print("Enter radius for Circle in cm (centimeter):- ");
        r= sc.nextInt();
        float areaOfCircle =(float) 3.14*r*r ;
        System.out.println("Area of circle is "+areaOfCircle+"cm");
    }

    @Override
    public void circumference()
    {
        float circumferenceOfCircle = 2*((float) 3.14*r);
        System.out.println("Circumference of circle is "+circumferenceOfCircle+"cm");
    }
}
class RectangleForAbstract extends Shape
{
    int l,b;
    Scanner sc = new Scanner(System.in);
    @Override
    public void area()
    {
        System.out.print("Enter length & breadth for rectangle in cm (centimeter):- ");
        l= sc.nextInt();
        b= sc.nextInt();
        int  areaOfRectangle = l*b;
        System.out.println("Area of rectangle is "+areaOfRectangle+"cm");
    }

    @Override
    public void circumference()
    {
        int circumferenceOfRectangle = 2*(l+b);
        System.out.println("Circumference of rectangle is "+circumferenceOfRectangle+"cm");
    }
}
public class AbstractExample
{
    public static void main(String[] args)
    {
        Shape objCircle = new CircleForAbstract();
        objCircle.area();
        objCircle.circumference();
        Shape objRectangle = new RectangleForAbstract();
        objRectangle.area();
        objRectangle.circumference();
    }
}

package Java;
class cylinder
{
    private int height,radius;
    public void setHeight(int heightOfCylinder)
    {
        height=heightOfCylinder;
    }
    public int getHeight()
    {
        return height;
    }
    public void setRadius(int radiusOfCylinder)
    {
        radius=radiusOfCylinder;
    }
    public int getRadius()
    {
        return radius;
    }
    public float AreaOfCylinder()
    {
        return (float) ((2*3.14*radius*height)+(2*3.14*radius*radius));
    }
    public float VolumeOfCylinder()
    {
        return (float) ((3.14*radius*radius*height));
    }
}
public class PracticeForAccessModifier1
{
    public static void main (String [] args)
    {
        cylinder a = new cylinder();
        a.setHeight(12);
        System.out.println("Height of Cylinder is "+a.getHeight());
        a.setRadius(9);
        System.out.println("Radius of cylinder is "+a.getRadius());
        System.out.println("Area of Cylinder is "+a.AreaOfCylinder());
        System.out.println("Volume of cylinder is "+a.VolumeOfCylinder());
    }
}

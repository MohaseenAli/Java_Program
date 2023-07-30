package Java;
class Cylinder1
{
    private final int radius;
    private final int height;

    public Cylinder1(int heightOfCylinder ,int radiusOfCylinder)
    {
        height=heightOfCylinder;
        radius=radiusOfCylinder;
    }
    public float AreaOfCylinder1()
    {
        return (float) ((2*3.14*radius*height)+(2*3.14*radius*radius));
    }
    public float VolumeOfCylinder1()
    {
        return (float) ((3.14*radius*radius*height));
    }

}
public class PracticeForConstructor1
{
    public static void main(String[] args)
    {
        Cylinder1 a = new Cylinder1(12,9);
        System.out.println("Area of Cylinder is "+a.AreaOfCylinder1());
        System.out.println("Volume of cylinder is "+a.VolumeOfCylinder1());
    }
}

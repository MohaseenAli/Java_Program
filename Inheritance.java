package Java;
class Base
{
    public int x;
    public int getX()
    {
        return x;
    }
    public void setX(int t)
    {
        x=t;
        System.out.println(x);
    }
}
class Derived extends Base
{
    public int v;
    public int getV()
    {
        super.setX(1);
        return v;
    }
    public void setV(int f)
    {
        v=f;
    }
}
public class Inheritance
{
    public static void main(String[] args)
    {
        Base b = new Base();
        b.setX(12);
        System.out.println(b.getX());
        Derived d = new Derived();
        d.setV(23);
        System.out.println(d.getV());
        d.setX(13);
        System.out.println(d.getX());
    }
}
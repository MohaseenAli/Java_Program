package Java;
class EkClass
{
    int a;
    EkClass(int v)
    {
        this.a=v;
    }
    public int getA()
    {
        return a;
    }
    public int returnOne()
    {
        return 1;
    }
}
class DoClass extends EkClass
{
    DoClass(int f)
    {
        super(f);
        System.out.println("I am a constructor");
    }
}
public class ThisSuper
{
    public static void main (String [] args)
    {
        EkClass e = new EkClass(23);
        System.out.println(e.getA());
        System.out.println(e.returnOne());
        new DoClass(2);
    }
}

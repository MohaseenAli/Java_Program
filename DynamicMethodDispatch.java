package Java;
class One
{
    public void name ()
    {
        System.out.println("My name is java in class one");
    }
    public void greet()
    {
        System.out.println("Good morning");
    }
}
class Two extends One
{
    @Override
    public void name ()
    {
        System.out.println("My name is java in class two");
    }
    public void swagat()
    {
        System.out.println("Apka swagat hai");
    }
}
public class DynamicMethodDispatch
{
    public static void main(String[] args)
    {
//        One obj = new One();
//        Two obj1 = new Two();
//        obj.name();
//        obj1.name();
//        Two obj3 = One(); Not Allowed
        One obj2 = new Two(); //Allowed (object is use to call method of parent class and method which override in child class)
        obj2.greet();
        obj2.name();
//        obj2.swagat() (not allowed)
    }
}

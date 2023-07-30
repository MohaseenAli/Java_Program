package Java;
class Base1
{
    public Base1()
    {
        System.out.println("I am a constructor");
    }
    public Base1(int a)
    {
//        a=12;
        System.out.println("I am a overloaded constructor with value of a = "+a+" From Base1");
    }
    public Base1(String d)
    {
//        d = "i am the main";
        System.out.println(d);
    }
}
class Derived1 extends Base1
{
    public Derived1()
    {
        super(1);
//        super("Mohaseen Ali");
        System.out.println("I am a Derived1 class constructor");
    }
    public Derived1(int l)
    {
        System.out.println("I am a Derived1 class constructor with value of l = "+l);
    }
}
class Derived2 extends Derived1
{
    public Derived2()
    {
        System.out.println("I am a Derived2 class constructor");
    }
}
class Derived3 extends Base1
{
    public Derived3()
    {
        super("Mohaseen ALi");
        System.out.println("I am a Derived3 class constructor");
    }
}
class Derived4 extends Derived2
{
    public Derived4()
    {
        System.out.println("I am a Derived4 class constructor");
    }
}
public class ConstructorInInheritance
{
    public static void main(String[] args)
    {
        System.out.println("For Base1");
        new Base1();
        System.out.println("\n\nFor Derived1");
        new Derived1();
        new Derived1(12);
        System.out.println("\n\nFor Derived1");
        new Derived1(0);
        System.out.println("\n\nFor Derived2");
        new Derived2();
        System.out.println("\n\nFor Derived3");
        new Derived3();
        System.out.println("\n\nFor Derived4");
        new Derived4();
    }
}
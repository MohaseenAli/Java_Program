package Java;
abstract class Parent
{
    public Parent()
    {
        System.out.println("I am a construct of Parent");
    }
    public Parent(int e)
    {
        System.out.println("I am a construct of Parent with value "+e);
    }
    public void sayHello()
    {
        System.out.println("Hello form Parent");
    }
    abstract public void greet();
    abstract public void greet1();
}
class Child extends Parent
{
    public Child()
    {
        super();
    }
    public Child(int a)
    {
        super(a);
    }
    @Override
    public void greet()
    {
        System.out.println("Good morning from Child");
    }

    @Override
    public void greet1()
    {
        System.out.println("Good afternoon from Child");
    }
}
abstract class Child2 extends Parent
{
    public void C2()
    {
        System.out.println("I am Child2");
    }
}
public class AbstractClass
{
    public static void main(String[] args)
    {
        Child c = new Child();
        c.greet();
        c.greet1();
        c.sayHello();
        Child c1 = new Child(12);
        c1.sayHello();
    }
}

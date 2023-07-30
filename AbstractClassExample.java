package Java;
public class AbstractClassExample
{
    public static void main (String [] args)
    {
        Child3 c3 = new Child3();
        Child4 c4 = new Child4();
        Child5 c5 = new Child5();
        c3.greet();
        c3.name();
        c5.greet();
        c5.name();
        c4.greet();
        c4.name();
    }
}
abstract class Parent1
{
    abstract public void name();
    abstract public void greet();
}
class Child3 extends Parent1
{
    @Override
    public void name()
    {
        System.out.println("I am Child3\n");
    }

    @Override
    public void greet()
    {
        System.out.println("Hello");
    }
}
class Child4 extends Parent1
{
    @Override
    public void name()
    {
        System.out.println("I am Child4 \n");
    }

    @Override
    public void greet()
    {
        System.out.println("Hey");
    }
}
class Child5 extends Parent1
{
    @Override
    public void name()
    {
        System.out.println("I am Child5\n");
    }

    @Override
    public void greet()
    {
        System.out.println("Good Morning");
    }
}
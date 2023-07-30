package Java;
class A {
    public int a = 4;

    public void method1()
    {
        System.out.println("I am method 1 of class A");
    }

    public void method2()
    {
        System.out.println("I am method 2 of class A");
    }
}
class B extends A
{
    @Override
    public void method1()
    {
        System.out.println("I am method 1 of class B");
    }
//   @Override      (It create an error because this method does not exist in class A)
    public void method3()
    {
        System.out.println("I am method 2 of class B");
    }
}
public class MethodOverriding
{
    public static void main(String[] args)
    {
        A a = new A();
        a.method1();
        a.method2();
        B b =new B();
        b.method2();
        b.method1();
        b.method3();
    }
}

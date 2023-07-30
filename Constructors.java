package Java;
class MyEmployee1
{
    private final int id1;
    private final String name;
    public MyEmployee1()
    {
        id1=1;
        name="Harry";
    }
    public MyEmployee1(String myName)
    {
        id1=2;
        name=myName;
    }
    public MyEmployee1(int id)
    {
        id1=id;
        name="Mohaseen Ali";
    }
    public MyEmployee1(int Id,String MyName)
    {
        id1=Id;
        name=MyName;
    }
     public String getName()
    {
        return name;
    }
    public int getId()
    {
        return id1;
    }
}
public class Constructors
{
    public static void main(String[] args)
    {
        MyEmployee1 harry = new MyEmployee1();
        System.out.println("My Id is "+harry.getId());
        System.out.println("My Name is "+harry.getName());


        MyEmployee1 w = new MyEmployee1("Medu");
        System.out.println("\n\nMy Id is "+w.getId());
        System.out.println("My Name is "+w.getName());


        MyEmployee1 e = new MyEmployee1(3);
        System.out.println("\n\nMy Id is "+e.getId());
        System.out.println("My Name is "+e.getName());


        MyEmployee1 r = new MyEmployee1(4,"Thavra Mohammed Ali");
        System.out.println("\n\nMy Id is "+r.getId());
        System.out.println("My Name is "+r.getName());
    }
}

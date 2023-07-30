package Java;
class MyEmployee
{
   private int id;
   private String name;
   public void setName(String n)
   {
       name=n;
   }
   public String getName()
   {
       return name;
   }
   public void setId(int i)
   {
       id=i;
   }
   public int getId()
   {
       return id;
   }
}
public class AccessModifier
{
    public static void main(String[] args)
    {
        MyEmployee a =  new MyEmployee();
//        a.id=1;
//        a.name="Mohaseen ALi"; --> Throws an error due vto private access modifier
        a.setName("Mohaseen Ali");
        System.out.println(a.getName());
        a.setId(1);
        System.out.println(a.getId());
    }
}

package Java;
public class meduConstructor
{
    public static void main(String[] args)
    {
        new meduConstructor("Mohaseen Ali",18);
        new meduConstructor(18,"Medu");
    }
    public meduConstructor(String name,int age )
    {
        System.out.println("Age = "+age+" \nName is "+name);
    }
    public meduConstructor(int age,String name )
    {
        System.out.println("Age = "+age+" \nName is "+name);
    }
}

package Java;
class Employee1
{
    int salary;
    String name;
    public int getSalary()
    {
        return salary;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name=n;
    }
}
public class practiceForOOPs_p1
{
    public static void main(String[] args)
    {
        Employee1 a = new Employee1();
        a.name = "Thavra Mohaseen Ali";
        a.salary=100000;
        int s = a.getSalary();
        System.out.println("Salary is "+s);
        String q= a.getName();
        System.out.println("Name is "+q);
//        OR
//        System.out.println("Name is "+a.getName());
        a.setName("Mohaseen Ali Thavra");
        System.out.println("\nUpdated Name is "+a.getName());

    }
}

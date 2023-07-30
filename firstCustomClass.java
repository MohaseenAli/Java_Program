package Java;
class Employee
{
    int id , salary;
    String name;
    public void printDetails()
    {
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
        System.out.println("My salary is "+salary);
    }
    public int getSalary()
    {
        return salary;
    }
}
class Employee2
{
    int id , salary;
    String name;
    public void printDetails()
    {
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
        System.out.println("My salary is "+salary);
    }
    public int getSalary()
    {
        return salary;
    }
}
public class firstCustomClass
{
    public static void main(String[] args)
    {
        // Instantiating a new Employee Object
        Employee mohaseen = new Employee();
        Employee harry = new Employee();

        // Instantiating a new Employee2 Object
        Employee2 m = new Employee2();
        Employee2 h = new Employee2();

//      Setting attributes or  properties for employee
        mohaseen.id=1;
        mohaseen.name="Thavra Mohaseen ALi";
        mohaseen.salary=80000;
        harry.id=2;
        harry.name ="Harry tripati";
        harry.salary=85000;

//        Setting attributes or  properties for employee2
        m.id=3;
        m.name="Rahul Shah";
        m.salary=70000;
        h.id=4;
        h.name ="Manthan Prajapati";
        h.salary=50000;

/*
        Printing the attributes or properties
        System.out.println(mohaseen.id);
        System.out.println(mohaseen.name);
*/
//           Make a methode (printDetails) to print in employee class
        System.out.println("==> From Employee\n");
        mohaseen.printDetails();
        int w = mohaseen.getSalary();
        System.out.println(w);
        System.out.println();
        harry.printDetails();
        int s = harry.getSalary();
        System.out.println(s);

//           Make a methode (printDetails) to print in employee2 class
        System.out.println("\n\n==> From Employee2\n");
        m.printDetails();
        System.out.println(m.getSalary());
        System.out.println();
        h.printDetails();
        System.out.println(h.getSalary());
    }
}


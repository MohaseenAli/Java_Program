package Java;
public class StringFunction
{
    public static void main(String[] args)
    {
        String name = "Mohaseen Ali" , name1 = "     Mohammed Ali     ", name2 = "Mohaseen Ali",name3 = "Mohaseen ali";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name1.trim());
        System.out.println(name1.length());
        System.out.println(name.substring(3));
        System.out.println(name.substring(4,10));
        System.out.println(name.replace('e','a'));
        System.out.println(name.replace("aseen","sin"));
        System.out.println(name.startsWith("mohas"));
        System.out.println(name.startsWith("Mohas"));
        System.out.println(name.endsWith("Ali"));
        System.out.println(name.endsWith("il"));
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf('e'));
        System.out.println(name.indexOf('A',4));
        System.out.println(name.lastIndexOf('e'));
        System.out.println(name.lastIndexOf('A', 11));
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));
        System.out.println(name.equalsIgnoreCase(name3));
        System.out.println("My name is \"Mohaseen Ali\" ");
        System.out.println("\t   My name is \n \t /\\Mohaseen Ali/\\ ");
    }
}
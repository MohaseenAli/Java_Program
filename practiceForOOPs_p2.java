package Java;
class square
{
    int side;
    public int area()
    {
        return side*side;
    }
    public int perimeter()
    {
        return 4*side;
    }
}
public class practiceForOOPs_p2
{
    public static void main(String[] args)
    {
        square a = new square();
        a.side = 5;
        System.out.println("Perimeter of square having side length '" +a.side+ "' is '" +a.perimeter()+"'");
        System.out.println("Area of square having side length '" +a.side+ "' is '" +a.area()+"'");
    }
}

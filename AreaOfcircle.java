package Java;
import java.util.Scanner;
public class AreaOfcircle
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        System.out.print("\n\nEnter radius of circle to find area :- ");
        float r= S.nextFloat(),area=3.14F*r;
        System.out.println("area of circle = "+area);
    }
}

import java.util.Scanner;
class CheckTheNumberIsIntegerOrNot
{
    public static void main(String[] args)
    {
        System.out.print("enter the number to check weather the number is an integer or not :-  ");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}

package Java;
import java.util.Scanner;
public class ToCheckTheStudentPassOrFail
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write The Marks Of PCM out of 100");
        float p= sc.nextFloat(),c= sc.nextFloat(),m= sc.nextFloat(),total=(p+c+m)/3;
        System.out.println("your overall percentage is :- "+total);
        if (p>=33 && c>=33 && m>=33 && total>=40)
        {
            System.out.println("You are pass");
        }
        else
        {
            if(p<33 || c<33 || m<33)
            {
                System.out.println("You are fail because in one or more than one subject you have less then 33 marks");
            }
            else
            {
                System.out.println("You are fail because your overall percentage is not greater than 40");
            }
        }
    }
}


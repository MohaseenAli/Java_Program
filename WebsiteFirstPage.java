package Java;
import java.util.Scanner;
public class WebsiteFirstPage
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine() ;
        System.out.println("Enter e-mail");
        String  e_mail = sc.nextLine() ;
        System.out.println("Enter Password");
        String password = sc.nextLine();
        System.out.println("Conform Passowrd");
        String password1 = sc.nextLine() ;
        System.out.println("<<-------- YOUR LOGIN DETAIL -------->>");
        System.out.println("\n--> Name :- " + name );
        System.out.println("\n\n--> E-mail :- "+e_mail);
        System.out.println("\n\n--> Password :- ********");
        if ((password.equals(password1)))
        {
            System.out.println("\n\n/\\--------You login sucessfully--------/\\");
        }
        else
        {
            System.out.println("Your password is not match");
        }
    }

}

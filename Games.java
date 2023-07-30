package Java;
import java.util.Random;
import java.util.Scanner;
//import java.util.*; instead of these two import statement
public class Games
{
    public static void main(String[] args)
    {
        games();
    }
    public static void games()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("--> Enter '1' to play Rock Paper Scissor \n--> Enter '2' to play guess the number");
        int e=sc.nextInt();
        switch (e)
        {
            case 1 ->
                    {
                        System.out.println("-Enter '0' for Stone \n-Enter '1' for Paper \n-Enter '2' for Scissor");
                        int a = sc.nextInt();
                        RockPaperScissor(a);
                    }
            case 2 -> guessTheNumber();
            default -> System.out.println("Select 1 or 2");
        }
    }

//  1).  ROCK PAPER SCISSOR

     public static void RockPaperScissor(int n)
    {
        if (n == 0 || n == 1 || n == 2)
        {
            Random a = new Random();
            int b = a.nextInt(3);
            if (b == 0)
            {
                System.out.println("--> System select 'Stone' ");
            }
            else if (b == 1)
            {
                System.out.println("--> System select 'Paper' ");
            }
            else
            {
                System.out.println("--> System select 'Scissor' ");
            }
            if (n == 0)
            {
                System.out.println("--> You select 'Stone' ");
            }
            else if (n == 1)
            {
                System.out.println("--> You select 'Paper' ");
            }
            else
            {
                System.out.println("--> You select 'Scissor' ");
            }
            if (n == b)
            {
                System.out.println("<-*-*-*-*-DRAW-*-*-*-*->");
            }
            else if (n == 0 & b == 2 || n == 1 & b == 0 || n == 2 & b == 1)
            {
                System.out.println("\n\n<-*-*-*-*-YOU WON-*-*-*-*->");
            }
            else
            {
                System.out.println("\n\n<-*-*-*-*-SYSTEM WON-*-*-*-*->");
            }
        }
        else
        {
            System.out.println("Select from 0,1 & 2");
        }
    }

//    2).  GUESS THE NUMBER

     public static void guessTheNumber()
     {
         int count=0;
         Scanner Sc = new Scanner(System.in);
         Random d = new Random();
         int store=d.nextInt(100)+1;
         while(true) {
             System.out.print("Guess the number :- ");
             int a = Sc.nextInt();
             if (a == store)
             {
                 System.out.println("\nYou do a correct guess");
                 count++;
                 break;
             }
             else if(count==15)
             {
                 System.out.println("\nYou have complected your all trials\n");
                 break;
             }
             else if (a > store)
             {
                 System.out.println("Your guess is larger do another guess\n");
                 count++;
             }
             else
             {
                 System.out.println("Your guess is smaller do another guess\n");
                 count++;
             }
         }
         if(count<15)
         System.out.println("\n\n-*-*-*-*-You complete the guess in "+count+" trials-*-*-*-*-");
         else
             System.out.println("The correct no. is "+store);

     }
}


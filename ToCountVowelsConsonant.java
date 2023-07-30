package Java;
import java.util.*;
public class ToCountVowelsConsonant
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int v = 0,c=0;
        System.out.print("Enter String ");
        String line=sc.nextLine();
        System.out.println(line);
        String a =line.toLowerCase();
        System.out.println(a);
        for (int i = 0; i <line.length(); i++)
        {
            char ch = a.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                v++;
            }
            else
            {
                c++;
            }
        }
        System.out.println("vowel = "+v);
        System.out.println("consonant = "+c);
    }
}

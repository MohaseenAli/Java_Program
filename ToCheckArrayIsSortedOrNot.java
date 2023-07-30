package Java;
public class ToCheckArrayIsSortedOrNot
{
    public static void main(String[] args)
    {
        int [] arr = {1,2,4,12,13,15};
        boolean  count = true;
        for (int i=0;i<arr.length-1;i++)
        {
            if (arr[i] >= arr[i + 1])
            {
                System.out.println("not sorted");
                count = false;
                break;
            }
        }
        if(count)
        {
            System.out.println("sorted");
        }
    }
}


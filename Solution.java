package Java;
class Solution
{
    public static void main(String [] args)
    {
        T t1 = new T();
        t1.start();
    }
}
class T extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            try
            {
                Thread.sleep(1000);
                System.out.println(i);
            }
            catch(Exception e)
            {
                System.out.println("Exception "+e);
            }
        }
    }
}
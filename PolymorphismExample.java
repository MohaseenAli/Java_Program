class Bank
{
   float getRateOfInterest()
   {
       return 0;
   }
}
class SBI extends Bank
{
    float gatRateOfInterest()
    {
        return 8.4f;
    }
}
class ICICI extends Bank
{
    float gatRateOfInterest()
    {
        return 7.3f;
    }
}
class AXIS extends Bank
{
    float gatRateOfInterest()
    {
        return 9.7f;
    }
}
public class PolymorphismExample
{
    public static void main(String[] args)
    {
        Bank b;

        b = new SBI();
        System.out.println("Rate Of Interest OF SIB bank is :- "+b.getRateOfInterest());

        b = new AXIS();
        System.out.println("Rate of interest of AXIS bank is :- "+b.getRateOfInterest());

        b = new ICICI();
        System.out.println("Rate of interest of ICICI bank is :- "+b.getRateOfInterest());
    }
}
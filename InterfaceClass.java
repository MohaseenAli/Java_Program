package Java;
interface Bicycle
{
    void applyBrake();
    void speedUp();
}
interface BicycleLookAndFeatures
{
    void colour();
    void colourOfTyre();
    void gear();
}
class AvonCycle implements Bicycle,BicycleLookAndFeatures
{
    void BlowHorn()
    {
        System.out.println("Pee Pee Poo Poo");
    }

    @Override
    public void applyBrake()
    {
        System.out.println("Apply break");
    }

    @Override
    public void speedUp()
    {
        System.out.println("Accelerate Bicycle");
    }

    @Override
    public void colour()
    {
        System.out.println("Colour Of cycle is black & red");
    }

    @Override
    public void colourOfTyre()
    {
        System.out.println("Colour of tyre is black");
    }

    @Override
    public void gear()
    {
        System.out.println("It consist of gear");
    }
}
public class InterfaceClass
{
    public static void main(String[] args)
    {
        Bicycle myCycle = new AvonCycle();
        BicycleLookAndFeatures myCycle1 = new AvonCycle();
        AvonCycle myCycle2 = new AvonCycle();
        myCycle2.BlowHorn();
        myCycle.applyBrake();
        myCycle.speedUp();
        myCycle1.colour();
        myCycle1.gear();
        myCycle1.colourOfTyre();
    }
}

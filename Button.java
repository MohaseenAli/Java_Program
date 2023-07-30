package Java;

import another.Color;

public class Button extends Color {
    int age=11;
    Button(){
        super();
        System.out.println("Age is "+age);
    }

    public void onClick()
    {
        System.out.println("Button CLicked");
    }
    public void onChangeEvent()
    {
        System.out.println("OnChangeEvent fired");
    }

    @Override
    public String redColor()
    {
        return super.redColor();
    }

    @Override
    public String blueColor()
    {
        return super.blueColor();
    }

    @Override
    public void printName(String name)
    {
        super.printName(name);
    }

    public static void main(String[] args)
    {
        Button btn = new Button();
        btn.printName("Medu");
        btn.printName("Hedo",12);

    }
}

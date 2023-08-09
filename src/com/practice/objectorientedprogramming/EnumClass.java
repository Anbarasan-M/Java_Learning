package com.practice.objectorientedprogramming;

enum Device
{
    Apple(1000), XPS, ThinkPad(1300), Surface(1200);

    private int price;

    private Device()
    // We can assign values for missing areas with the help of default constructor
    // it will be called only one time
    {
        price = 1450;
    }


    Device(int price) // this will run four times
    {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class EnumClass {
    public static void main(String[] args)
    {
        Device d = Device.Surface;
        System.out.println(d.getPrice());

        for (Device lap : Device.values())
        {
            System.out.println(lap + ":" + lap.getPrice());
        }
    }
}

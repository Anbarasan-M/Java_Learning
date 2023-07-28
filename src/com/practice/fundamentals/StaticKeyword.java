package com.practice.fundamentals;

class Mobile
{

    //The static variable is introduced into the string
    static String name;

    //After representing it as static, the element represented by the variable will be the same name for every instance in the class
    int price;
    String generation;

//    Creating a method without static variable
    public void show()
    {
        System.out.println(name + " " + price + " "+ generation);
    }
//    Creating a method with static variable
    public static void show1(Mobile obj)
    {
//        System.out.println(name + " " + price + " "+ generation);
//        This line will show error because we cannot not use non-static variable inside static method
//        But with object reference it is possible
        System.out.println(name + " "+ obj.price+ " "+obj.generation);
    }

}
public class StaticKeyword
{
    public static void main(String[] args)
    {
        Mobile obj1 = new Mobile();
//We changed the name variable to static one, so it can be represented with the help of class itself like ( Mobile.name instead of obj1.name)

        Mobile.name = "Samsung";
        obj1.price = 1000;
        obj1.generation = "5g";

        Mobile obj2 = new Mobile();

        Mobile.name = "Apple";
        obj2.price = 1100;
        obj2.generation = "5g";

        Mobile.name = "Realme";

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
//We can directly create object when static variable is used
    }
}

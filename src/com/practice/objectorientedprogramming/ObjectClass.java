package com.practice.objectorientedprogramming;

class Laptop
{
    String model;
    int price;
}
public class ObjectClass
{
    public static void main(String[] args)
    {
        Laptop obj = new Laptop();
        obj.model = "HP 15s";
        obj.price = 39999;

        System.out.println(obj.toString()); // printing object will automatically call to string() method, that's why we mention it
    }
}

//class Laptop{
//
//    String name;
//    int price;
//
//    public boolean compare(Laptop that){
//        return (this.name.equals(that) && this.price == that.price);
//    }
//
//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((name == null) ? 0 : name.hashCode());
//        result = prime * result + price;
//        return result;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (getClass() != obj.getClass())
//            return false;
//        Laptop other = (Laptop) obj;
//        if (name == null) {
//            if (other.name != null)
//                return false;
//        } else if (!name.equals(other.name))
//            return false;
//        if (price != other.price)
//            return false;
//        return true;
//    }
//}
//
//public class Hello{
//    public static void main(String [] args)
//    {
//        Laptop obj1 = new Laptop();
//        obj1.name = "apple";
//        obj1.price = 1000;
//
//        Laptop obj2 = new Laptop();
//        obj2.name = "Samsung";
//        obj2.price = 999;
//
//        boolean a = obj1.compare(obj2);
//
//
//        System.out.println(a);
//
//
//    }
//
//}
package com.practice.objectorientedprogramming;

class Human
{
    private String name;
    private int age;

    public void setName(String name)
    {
//        name = n; We can also use identical names for local and instance variable with the help of (this) keyword
        this.name = name;
    }
    public void setAge(int age)
    {
//        age = ab;  We can also use identical names for local and instance variable with the help of (this) keyword
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}
public class Encapsulation
{
    public static void main(String[] args)
    {
        Human obj = new Human();

        obj.setName("Anbar");
        obj.setAge(21);

        System.out.println(obj.getName() + " " + obj.getAge());
    }
}
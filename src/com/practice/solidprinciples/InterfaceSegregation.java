package com.practice.solidprinciples;

//The principle states that the larger interfaces split into smaller ones.
// Because the implementation classes use only the methods that are required.
// We should not force the client to use the methods that they do not want to use.


//interface Operations
//{
//    void toChar();
//    void toInt();
//    void toDouble();
//}  This is not the right way

interface ConvertToChar
{
    void toChar();
}
interface ConvertToInt
{
    void toInt();

}
interface ConvertToDouble
{
    void toDouble();
}

public class InterfaceSegregation
{
    public static void main(String[] args)
    {
        System.out.println("This is interface segregation principle");
    }
}

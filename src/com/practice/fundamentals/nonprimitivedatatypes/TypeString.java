package com.practice.fundamentals.nonprimitivedatatypes;

public class TypeString
{
    public static void main(String [] args)
    {
        String name = new String("Anbarasan");
        System.out.println(name);

//It can also be represented normally
        String name1 = "Anbarasan";
        System.out.println(name1);

//Elements can bes accessed using index in string
        System.out.println(name.charAt(0));

//We can concat string
        System.out.println(name.concat(" Muthu"));

//We can add string wth a string
        name = name + "Muthu";
        System.out.println(name);

//String Buffer
//It will provide some mutable string which is very useful while programming with strings

        StringBuilder sb = new StringBuilder("Anbarasan");
        int ans = sb.capacity();
        System.out.println(ans); // it will print 35 because it is 16 + 9

//Methods in StringBuilder

        sb.append(" Muthu");
        sb.deleteCharAt(8);
        sb.insert(8, "u");
        sb.ensureCapacity(30);
        sb.setLength(15);
        sb.toString();
        System.out.println(sb);

    }
}

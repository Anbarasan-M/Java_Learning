package com.practice.fundamentals.nonprimitivedatatypes;

class Details
{
    String name;
    int age;
    double grade;
}
public class MultiDimensionalArrayAssignment{
    public static void main(String [] args)
    {
        Details s1 = new Details();
        s1.name = "Anbu";
        s1.age = 21;
        s1.grade = 8.3;

        Details s2 = new Details();
        s2.name = "Someone";
        s2.age = 22;
        s2.grade = 8.4;

        Details s3 = new Details();
        s3.name = "Him";
        s3.age = 24;
        s3.grade = 8.5;

        Details students[] = new Details[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < 3; i ++)
        {
            System.out.println(students[i].name + " " + students[i].age + " " + students[i].grade);
        }
    }
}
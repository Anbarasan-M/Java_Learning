package com.practice.solidprinciples;
//The Open/Closed Principle (OCP) is one of the SOLID principles of object-oriented design, introduced by Bertrand Meyer.
// It states that software entities (such as classes, modules, functions, etc.) should be open for extension but closed for modification.
// In other words, once a module is developed and stable,
// its behavior should be extendable without requiring changes to its source code.
class Shape
{
    public void draw()
    {
        System.out.println("Method draw defined");
    }
}class Circle extends Shape
{
    public void draw()
    {
        System.out.println("Drawing a Circle");
    }
}class Square extends Shape
{
    public void draw()
    {
        System.out.println("Drawing a square");
    }
}class Triangle extends Shape
{
    public void draw()
    {
        System.out.println("Drawing a Triangle");
    }
}

public class OpenClosed
{
    public static void main(String[] args )
    {
        Shape[] shapes = {new Circle(), new Square(), new Triangle()};
        for (Shape shape:shapes)
        {
            shape.draw();
        }
    }
}

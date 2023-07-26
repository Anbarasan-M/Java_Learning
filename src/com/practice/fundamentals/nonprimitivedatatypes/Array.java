package com.practice.fundamentals.nonprimitivedatatypes;

public class Array
{
    public static void main(String[] args)
    {
//Declaring a basic array
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(array[0]);
//Declaring an empty array with dynamic size
        int[] array1 = new int[5];
        System.out.println(array1[0]);

// Declaring an empty dynamic array
        int[][] num = new int[3][4];

//Loop to get random values
        for (int i = 0; i < 3; i ++ )
        {
            for (int j = 0; j < 4; j ++)
            {
                num[i][j] = (int) (Math.random() * 10);
            }
        }
//Loop to assign random values to its position
        for (int i = 0; i < 3; i ++){
            for (int j = 0; j < 4; j ++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
//Enhanced for loop
        for (int[] num1 : num){
            for (int n:num1){
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
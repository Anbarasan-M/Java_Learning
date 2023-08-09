package com.practice.objectorientedprogramming;

@FunctionalInterface
interface LamAdd
{
    int sum(int i, int j);
}
public class MethodsInLambda {

    public static void main(String[] args) {


        LamAdd obj = (i, j) -> i + j;

        int result = obj.sum(5, 7);
        System.out.println(result);
    }
}
/*
      LamAdd obj = new LamAdd();
        {
            public int sum(int i, int j)
            {
                return i + j;
            }
        };
        int result = obj.sum(2, 3);
        System.out.println(result);
*/
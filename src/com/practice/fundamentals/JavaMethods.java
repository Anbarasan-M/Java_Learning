package com.practice.fundamentals;

class Do{
    int num = 5;
    public int addNUm(int n1, int n2){
        return n1 + n2;
    }
}
public class JavaMethods{
    public static void main(String[] args){
        Do obj = new Do();
        Do obj1 = new Do();
        int ref_var = obj.addNUm(2, 4);
        obj.num = 10;
        System.out.println(ref_var);
        System.out.println((obj.num));
        System.out.println(obj1.num);
    }
}
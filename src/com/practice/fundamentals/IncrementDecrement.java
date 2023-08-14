package com.practice.fundamentals;

class increment_decrement {
    public static void main(String[] args){
        int num = 7;
        int result = 0;

        num = num +1;

        num += 1;

        num ++; //post increment - first fetch and then increase

        ++ num; //pre increment - first increase and then fetch

        result += num;
        System.out.println(result);

        int n1 = 1; int n2 = 2;
        int result1 = n1++ + n2 + ++n1;
        System.out.println(result1);
    }
}

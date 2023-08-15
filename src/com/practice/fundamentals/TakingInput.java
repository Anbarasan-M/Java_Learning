//package com.practice.fundamentals;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//
//public class TakingInput
//{
//    public static void main(String[] args) throws IOException
//    {
//        System.out.println("Enter a number");
//
//        InputStream in = new InputStream(System.in) {
//            @Override
//            public int read() throws IOException {
//                return 0;
//            }
//        };
//        BufferedReader bf = new BufferedReader(in);
//        int num = Integer.parseInt(bf.readLine());
//
//        bf.close();
//    }
//}
package com.practice.fundamentals;
import java.util.Scanner;

public class TakingInput
{
    public static void main(String[] args)
    {
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("The given number is  " +num);
    }
}
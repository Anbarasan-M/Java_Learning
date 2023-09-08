package com.practice.problems;
import java.util.Scanner;

public class AccRatCountHouse extends Thread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Number of rats r");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Enter number of units");
        int unit = sc.nextInt();
        System.out.println("Enter number of houses");
        int n = sc.nextInt();
        System.out.println("Enter Food contained");
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int food_required = r*unit;
        int required = 0;
        int count = 0;

        for (int j : arr) {
            required += j;
            count += 1;
            if (required >= food_required) {
                break;
            }
        }
        Thread.sleep(500);
        System.out.println("Output " + count);
    }
}

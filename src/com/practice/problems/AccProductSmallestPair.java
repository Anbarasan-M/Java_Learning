package com.practice.problems;

public class AccProductSmallestPair {
    public static int productSmallestPair(int[] arr, int sum){

        int temp = Integer.MAX_VALUE;
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] <= sum && arr[i] + arr[j] <=temp){
                    temp = arr[i] + arr[j];
                    ans = arr[i] * arr[j];
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){

        int result = productSmallestPair(new int[]{9, 8, 3, -7, 3, 9}, 9);
        System.out.println(result);
    }
}

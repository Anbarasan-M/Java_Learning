package com.practice.problems;

public class SumWithKElements {
    public static void main(String[] args){
        int result = SumWithKElements.maximizeSum(new int[]{1,2, 3, 4, 5}, 3);
        System.out.println(result);
    }
    public static int maximizeSum(int[] nums, int k) {
        int max = nums[0];
        for(int n:nums){
            if(n>max){
                max = n;
            }
        }
        int count = max;
        for(int i = 0; i<k-1; i++){
            max += 1;
            count += max;
        }
        return count;
    }
}

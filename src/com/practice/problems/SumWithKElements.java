package com.practice.problems;

class SWKESolution {
    public int maximizeSum(int[] nums, int k) {
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
public class SumWithKElements {
    public static void main(String[] args){
        SWKESolution obj = new SWKESolution();
        int result = obj.maximizeSum(new int[]{1,2, 3, 4, 5}, 3);
        System.out.println(result);
    }
}

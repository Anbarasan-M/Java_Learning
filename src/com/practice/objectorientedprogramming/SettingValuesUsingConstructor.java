package com.practice.objectorientedprogramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SettingValuesUsingConstructor {
    public static void main(String[] args){
        Map<Integer, Integer> map = new HashMap<>();
        int[] nums = {3, 5, 3, 6, 2, 7, 1};
        int target = 7;
        int[] result = new int[2];

        for(int i=0; i<nums.length; i++){
            int req = target - nums[i];
            if(map.containsKey(req)){
                result[0] = i;
                result[1] = map.get(req);
            }
            map.put(nums[i], i);
        }
        System.out.println(Arrays.toString(result));
    }
}

package com.practice.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSumSolution
{
    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            int req = target - nums[i];
            if (map.containsKey(req)){
                result[1] = i;
                result[0] = map.get(req);
            } map.put(nums[i], i);
        }
        return result;
    }

}
public class TwoSum
{
    public static void main(String[] args)
    {
        TwoSumSolution obj = new TwoSumSolution();
        System.out.println(Arrays.toString(obj.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}

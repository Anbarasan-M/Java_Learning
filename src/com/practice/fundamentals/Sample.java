package com.practice.fundamentals;
//public class Sample{
//    public static void main(String [] args){
//
//        int n1 = 10; int n2 = 33;
//        int ans_count = 0;
//
//        for(int i=n1; i<=n2; i++){
//
//            int temp_num = i%10;
//            int temp_count = 0;
//            i/=10;
//            int org = i;
//            while(org !=0){


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//                int num = i%10;
//                if(temp_num == num){
//                    temp_count += 1;
//                }
//                temp_num = num;
//                org/=10;
//                if(temp_count > 0){
//                    ans_count +=1;
//            }
//            }
//        }
//        System.out.println(ans_count);
//
//    }
//}
public class Sample{
    public static void main(String[] args){

        String name = "All is well and god is well";
        String[] separated = name.split(" ");
        System.out.println(Arrays.toString(separated));
        Map<String, Integer> mapper = new HashMap<String, Integer>();
        for(String word:separated){
            if(mapper.containsKey(word)){
                mapper.put(word, mapper.get(word)+1);
            }
            else{
                mapper.put(word, 1);
            }
        }
        int n = mapper.get("well");
        System.out.println(n);
        System.out.println(mapper);
    }
}
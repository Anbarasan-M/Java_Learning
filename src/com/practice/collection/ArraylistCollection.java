package com.practice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ArraylistCollection
{
    public static void main(String[] args){
        List<Integer> fruitPrices = new ArrayList<>();

        fruitPrices.add(61);
        fruitPrices.add(21);
        fruitPrices.add(31);
        fruitPrices.add(41);
        fruitPrices.add(51);


        Collections.sort(fruitPrices);
        System.out.println(fruitPrices);
    }
}

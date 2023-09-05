package com.practice.problems;

import java.util.Arrays;

class CFSolution{
    public double[] convertTemperature(double celsius) {
        double[] list = new double[2];
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        list[0] = kelvin;
        list[1] = fahrenheit;
        return list;
    }
}
public class CelsiusFahrenheit {
    public static void main(String[] args){
        CFSolution obj = new CFSolution();
        double celsius = 36.50;
        double[] result = obj.convertTemperature(celsius);
        System.out.println(Arrays.toString(result));
    }
}

package com.practice.problems;
import java.util.Arrays;

public class CelsiusFahrenheit {
    public static void main(String[] args){

        double celsius = 36.50;
        double[] result = CelsiusFahrenheit.convertTemperature(celsius);
        System.out.println(Arrays.toString(result));
    }
    public static double[] convertTemperature(double celsius) {
        double[] list = new double[2];
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        list[0] = kelvin;
        list[1] = fahrenheit;
        return list;
    }
}

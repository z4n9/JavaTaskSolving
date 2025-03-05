package Basic;

import java.util.ArrayList;

public class MaxMinAvg {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add((int) (Math.random() * 10));
        }
        for (Integer i : arr) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println(maxValue(arr));
        System.out.println(minValue(arr));
        System.out.println(avgValue(arr));
    }
    public static int maxValue(ArrayList<Integer> arr){
        int max = 0;
        for (int i : arr) {
            if (i > max){
                max = i;
            }
        }
        return max;
    }
    public static int minValue(ArrayList<Integer> arr){
        int min = maxValue(arr);
        for (int i : arr) {
            if (i < min){
                min = i;
            }
        }
        return min;
    }
    public static int avgValue(ArrayList<Integer> arr){
        int avg = 0;
        for (int i : arr) {
            avg += i;
        }
        return avg / arr.size();
    }
}

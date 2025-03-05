package Basic;

import java.util.ArrayList;

public class BubbleSort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add((int) (Math.random() * 1000 ));
        }
        for (Integer i : arr) {
            System.out.println(i);
        }
        getSorted(arr);
        System.out.println("Array is sorted");
        for (Integer i : arr) {
            System.out.println(i);
        }
    }
    public static void getSorted(ArrayList<Integer> arr){
        for (int i = 0; i < arr.size()-1; i++) {
            for (int j = 0; j < arr.size()-1-i; j++) {
                if(arr.get(j) > arr.get(j+1)){
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                }
            }
        }
    }
}

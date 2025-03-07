package Basic;

import java.util.ArrayList;

public class PrimeNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i <= 1000; i++) {
            arr.add(i);
        }

        //System.out.println(arr);

        getPrimeNum(arr);
    }
    static void getPrimeNum(ArrayList<Integer> arr){
        for (int i = 2; i <= 1000; i++) {
            int temp = 0;
            for (int j = 1; j < i ; j++) {
                if (arr.get(i) % arr.get(j) == 0){
                    temp += 1;
                    if (temp > 1){
                        break;
                    }
                }
            }
            if (temp == 1){
                System.out.println(arr.get(i));
            }

        }
    }
}


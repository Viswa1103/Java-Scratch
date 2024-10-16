package Restart.Sorting;

import java.util.Arrays;

public class buuble {
    public static void main(String[] args) {
        int[] arr = new int[] { 45, 65, 23, 13, 54, 77 };
        bu(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bu(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swap = true;
                }
            }
            if (swap == false) {
                break;
            }

        }
    }

}

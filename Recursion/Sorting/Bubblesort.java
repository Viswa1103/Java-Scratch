package Recursion.Sorting;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        search(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void search(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }

        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }

            search(arr, r, c + 1);
        } else {
            search(arr, r - 1, 0);
        }
    }

}

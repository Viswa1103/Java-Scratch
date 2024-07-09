package Recursion.Sorting;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        search(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void search(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }

        if (c < r) {
            if (arr[c] > arr[max]) {
                search(arr, r, c + 1, c);
            } else {
                search(arr, r, c + 1, max);
            }
        } else {
            int temp = arr[r - 1];
            arr[r - 1] = arr[max];
            arr[max] = temp;
            search(arr, r - 1, 0, 0);
        }
    }
}

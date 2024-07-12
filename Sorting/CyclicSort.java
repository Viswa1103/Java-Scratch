package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 3, 4, 8, 7, 2 };
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int c = arr[i] - 1;
            if (arr[i] != arr[c]) {
                swap(arr, i, c);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int m, int l) {
        int temp = arr[l];
        arr[l] = arr[m];
        arr[m] = temp;
    }
}

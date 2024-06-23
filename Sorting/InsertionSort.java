package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 5, 4, 1, 2 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int m, int l) {
        int temp = arr[l];
        arr[l] = arr[m];
        arr[m] = temp;
    }
}

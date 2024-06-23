package Sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 5, 4, 1, 2 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int last = arr.length - i - 1;
            int maxindex = getMaxIndex(arr, start, last);
            swap(arr, maxindex, last);
        }
    }

    static int getMaxIndex(int[] arr, int s, int l) {
        int max = 0;
        for (int i = s; i <= l; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int m, int l) {
        int temp = arr[l];
        arr[l] = arr[m];
        arr[m] = temp;
    }
}

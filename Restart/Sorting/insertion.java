package Restart.Sorting;

import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int[] arr = new int[] { 34, 54, 64, 76, 23, 45, 32 };

        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
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

    public static void swap(int[] arr, int n, int n2) {
        int temp = arr[n];
        arr[n] = arr[n2];
        arr[n2] = temp;
    }
}

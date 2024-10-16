package Restart.Sorting;

import java.util.Arrays;

public class cyclic {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 5, 2, 1, 4 };

        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
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

    public static void swap(int[] arr, int n1, int n2) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
}

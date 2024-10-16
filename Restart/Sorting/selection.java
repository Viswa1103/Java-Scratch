package Restart.Sorting;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] arr = new int[] { 34, 456, 75, 3, 22, 66, 24, 76, 98 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int f = 0;
            int l = arr.length - i - 1;
            int max = get(arr, f, l);
            swap(arr, max, l);
        }

    }

    public static int get(int[] arr, int f, int l) {
        int max = 0;
        for (int i = f; i <= l; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int n1, int n2) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
}

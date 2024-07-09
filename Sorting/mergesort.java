package Sorting;

import java.util.Arrays;

public class mergesort {

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        int[] ans = ms(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] ms(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = ms(Arrays.copyOfRange(arr, 0, mid));
        int[] right = ms(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);

    }

    private static int[] merge(int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] f = new int[left.length + right.length];

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                f[k] = left[i];
                i++;

            } else {
                f[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            f[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            f[k] = right[j];
            j++;
            k++;
        }
        return f;
    }
}

package Restart.Sorting;

import java.util.Arrays;

public class quick {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 2, 4, 5, 1 };
        int l = 0;
        int h = arr.length - 1;
        sort(arr, l, h);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int l, int h) {
        if (l >= h) {
            return;
        }
        int s = l;
        int e = h;
        int m = s + (e - s) / 2;
        int p = arr[m];

        while (s <= e) {
            while (arr[s] < p) {
                s++;
            }
            while (arr[e] > p) {
                e--;
            }

            if (s <= e) {
                int t = arr[s];

                arr[s] = arr[e];
                arr[e] = t;
                s++;
                e--;
            }
        }
        sort(arr, l, e);
        sort(arr, s, h);
    }
}

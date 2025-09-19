package Restart.Searching;

import java.util.Arrays;
import java.util.Scanner;

// import StackandQueue.Stack.stack;

public class binary {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 4, 54, 67, 87, 33 };
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Arrays.sort(arr);
        se(arr, n);
        sc.close();

    }

    public static void se(int[] arr, int n) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] == n) {
                System.out.println(m);
                return;
            }
            if (arr[m] > n) {
                e = m - 1;
            }
            if (arr[m] < n) {
                s = m + 1;
            }

        }
        System.out.println(-1);

    }

}

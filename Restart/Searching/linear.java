package Restart.Searching;

import java.util.Scanner;

public class linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[] { 33, 55, 66, 77, 888, 222, 11 };
        int n = sc.nextInt();
        li(arr, n);
    }

    public static void li(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(-1);
    }
}

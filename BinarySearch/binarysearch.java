package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int res = search(arr, t);
        if (res != -1) {
            System.out.println("Element found at index " + res);
        } else {
            System.out.println("Element not found");
        }
        sc.close();
    }

    static int search(int[] arr, int t) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == t) {
                return mid;

            }
            if (t > arr[mid]) {
                start = mid + 1;
            }
            if (t < arr[mid]) {
                end = mid - 1;
            }
        }
        return -1;

    }
}

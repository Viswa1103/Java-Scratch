package SimplePrograms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class reversearr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array element:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        rev(arr);

    }

    static void rev(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;

        }
        System.out.println(Arrays.toString(arr));

    }
}

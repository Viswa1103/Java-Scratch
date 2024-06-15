package LinearSearch;

import java.util.Scanner;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class evendigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = findNumbers(arr);
        System.out.println(res);
        sc.close();

    }

    static int findNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (even(arr[i])) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        if (digits(num) % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    static int digits(int num) {
        // int count = 0;
        // if (num < 0) {
        // num = num * -1;
        // }
        // if (num == 0) {
        // return 1;
        // }
        // while (num > 0) {
        // count++;
        // num = num / 10;
        // }
        // return count;
        return (int) (Math.log10(num)) + 1;

    }

}

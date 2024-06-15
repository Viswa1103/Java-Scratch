package LinearSearch;

// https://leetcode.com/problems/richest-customer-wealth/
import java.util.Scanner;

public class MaxWealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int res = maximumWealth(arr);
        System.out.println(res);
        sc.close();
    }

    static int maximumWealth(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];

            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}

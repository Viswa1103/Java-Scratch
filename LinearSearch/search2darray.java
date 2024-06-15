package LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class search2darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the search element:");
        int t = sc.nextInt();

        int[] res = search(arr, t);
        System.out.println(Arrays.toString(res));
        sc.close();
    }

    static int[] search(int[][] arr, int t) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == t) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}

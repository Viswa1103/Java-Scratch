package MazeProblem;

import java.util.Scanner;

import StackandQueue.Stack.stack;

public class mazezoho {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        if (arr[n - 1][n - 1] == 0) {
            System.out.println("-1");
            System.exit(0);
        } else {
            path("", 0, 0, arr);
        }

    }

    private static void path(String p, int r, int c, int[][] arr) {
        int n = arr.length - 1;
        // System.out.println(n);
        if (r == n && c == n) {
            System.out.println(p);
            return;

        }
        if (arr[r][c] == 0) {
            return;
        }
        arr[r][c] = 0;

        if (r < n) {
            path(p + 'D', r + 1, c, arr);
        }
        if (r > 0) {
            path(p + 'U', r - 1, c, arr);
        }
        if (c < n) {
            path(p + 'R', r, c + 1, arr);
        }
        if (c > 0) {
            path(p + 'L', r, c - 1, arr);
        }
        arr[r][c] = 1;
    }
}

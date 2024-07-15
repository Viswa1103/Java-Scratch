package MazeProblem;

import java.util.Scanner;

public class zohomaze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] maze = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        if (maze[n - 1][n - 1] == 0) {
            System.out.println("-1");
        } else

            path("", maze, 0, 0);

    }

    private static void path(String p, int[][] maze, int r, int c) {
        int n = maze.length - 1;
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (maze[r][c] == 0) {
            return;
        }

        maze[r][c] = 0;
        if (r < n) {
            path(p + 'D', maze, r + 1, c);
        }
        if (r > 0) {
            path(p + 'U', maze, r - 1, c);
        }
        if (c < n) {
            path(p + 'R', maze, r, c + 1);
        }
        if (c > 0) {
            path(p + 'L', maze, r, c - 1);
        }

        maze[r][c] = 1;

    }

}

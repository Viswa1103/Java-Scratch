package MazeProblem;

import java.util.Arrays;

import Recursion.Array.sortedarray;

public class printpath {
    public static void main(String[] args) {
        boolean[][] river = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };
        int[][] path = new int[river.length][river[0].length];
        path(river, "", 0, 0, path, 1);

    }

    static void path(boolean[][] river, String p, int r, int c, int[][] way, int step) {
        if (r == river.length - 1 && c == river[0].length - 1) {
            way[r][c] = step;
            for (int[] arr : way) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (river[r][c] == false) {
            return;
        }

        river[r][c] = false;
        way[r][c] = step;
        if (r < river.length - 1) {
            path(river, p + 'D', r + 1, c, way, step + 1);
        }
        if (c < river[0].length - 1) {
            path(river, p + 'R', r, c + 1, way, step + 1);
        }

        if (r > 0) {
            path(river, p + 'U', r - 1, c, way, step + 1);
        }

        if (c > 0) {
            path(river, p + 'L', r, c - 1, way, step + 1);
        }

        river[r][c] = true;
        way[r][c] = 0;

    }
}
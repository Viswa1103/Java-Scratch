package MazeProblem;

import java.util.ArrayList;
import java.util.List;

public class allpath {
    public static void main(String[] args) {
        boolean[][] river = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };
        System.out.println(path(river, "", 0, 0));

    }

    static List<String> path(boolean[][] river, String p, int r, int c) {
        if (r == river.length - 1 && c == river[0].length - 1) {
            List<String> list = new ArrayList<>();
            list.add(p);
            // System.out.println(p);
            return list;
        }

        if (river[r][c] == false) {
            List<String> list = new ArrayList<>();
            return list;
        }

        List<String> list = new ArrayList<>();
        river[r][c] = false;
        if (r < river.length - 1) {
            list.addAll(path(river, p + 'D', r + 1, c));
        }
        if (c < river[0].length - 1) {
            list.addAll(path(river, p + 'R', r, c + 1));
        }

        if (r > 0) {
            list.addAll(path(river, p + 'U', r - 1, c));
        }

        if (c > 0) {
            list.addAll(path(river, p + 'L', r, c - 1));
        }

        river[r][c] = true;

        return list;

    }
}
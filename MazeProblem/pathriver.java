package MazeProblem;

public class pathriver {
    public static void main(String[] args) {
        boolean[][] river = {
                { true, true, true },
                { true, false, true },
                { true, true, true }
        };
        path(river, "", 0, 0);

    }

    static void path(boolean[][] river, String p, int r, int c) {
        if (r == river.length - 1 && c == river[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (river[r][c] == false) {
            return;
        }
        if (r < river.length - 1) {
            path(river, p + 'D', r + 1, c);
        }
        if (c < river[0].length - 1) {
            path(river, p + 'R', r, c + 1);
        }

    }
}
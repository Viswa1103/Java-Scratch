package MazeProblem;

public class queen {
    public static void main(String[] args) {
        int n = 5;
        boolean[][] b = new boolean[n][n];
        n(b, 0);

    }

    public static void n(boolean[][] b, int r) {
        if (r == b.length) {
            d(b);
            return;
        }

        for (int c = 0; c < b.length; c++) {

            if (safe(b, r, c)) {
                b[r][c] = true;
                n(b, r + 1);
                b[r][c] = false;

            }

        }
        return;
    }

    private static boolean safe(boolean[][] b, int r, int c) {

        for (int i = 0; i < r; i++) {
            if (b[i][c]) {
                return false;
            }
        }

        int ml = Math.min(r, c);

        for (int i = 1; i <= ml; i++) {
            if (b[r - i][c - i]) {
                return false;
            }
        }

        int mr = Math.min(r, b.length - c - 1);

        for (int i = 1; i <= mr; i++) {
            if (b[r - i][c + i]) {
                return false;
            }
        }

        return true;
    }

    private static void d(boolean[][] b) {

        for (boolean[] r : b) {
            for (boolean e : r) {
                if (e) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}

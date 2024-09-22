package SimplePrograms;

public class spiralmat {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        int m = mat.length;
        int n = mat[0].length;
        int t = 0;
        int b = m - 1;
        int l = 0;
        int r = n - 1;

        while (t <= b && l <= r) {
            for (int i = l; i <= r; i++) {
                System.out.println(mat[t][i]);
            }
            t++;

            for (int i = t; i <= b; i++) {
                System.out.println(mat[i][r]);

                // list.add(mat[i][r]);
            }
            r--;
            if (t <= b) {
                for (int i = r; i >= l; i--) {
                    System.out.println(mat[b][i]);

                    // list.add(mat[b][i]);
                }
                b--;
            }
            if (l <= r) {
                for (int i = b; i >= t; i--) {
                    System.out.println(mat[i][l]);

                    // list.add(mat[i][l]);
                }
                l++;
            }

        }
    }
}

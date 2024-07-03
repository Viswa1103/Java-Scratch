// 12.  * * * * *
//       * * * *
//        * * *
//         * *
//          *
//          *
//         * *
//        * * *
//       * * * *
//      * * * * *

// 13.      *
//         * *
//        *   *
//       *     *
//      *********

// 14.  *********
//       *     *
//        *   *
//         * *
//          *

// 15.      *
//         * *
//        *   *
//       *     *
//      *       *
//       *     *
//        *   *
//         * *
//          *

package Patterns;

public class Patterns3 {
    public static void main(String[] args) {
        pattern15(10);
    }

    static void pattern12(int n) {
        for (int i = 1; i <= n * 2; i++) {
            int c = i > n ? 2 * n - i : i - 1;
            for (int j = 1; j <= c; j++) {
                System.out.print(" ");
            }
            int s = i > n ? i - n : n - i + 1;
            for (int k = 1; k <= s; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern13(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = n - i; k <= n + i - 1; k++) {
                if ((k == n - i && i > 1) || k == n + i - 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern14(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= 2 * n - i; k++) {
                if (i == 1 || k == 2 * n - i || k == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    static void pattern15(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int c = i <= n ? n - i : i - n;
            for (int j = 1; j <= c; j++) {
                System.out.print(" ");
            }
            int s = i <= n ? n + i - 1 : 2 * n - ((i - n) + 1);
            for (int k = c; k <= s; k++) {
                if (k == c + 1 || k == n + i - 1 || k == 2 * n - ((i - n) + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}

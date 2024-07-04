// 21.    1
//        2  3
//        4  5  6
//        7  8  9  10
//        11 12 13 14 15

// 22.    1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1

// 23.        *      *
//          *   *  *   *
//        *      *      *

// 24.    *        *
//        **      **
//        * *    * *
//        *  *  *  *
//        *   **   *
//        *   **   *
//        *  *  *  *
//        * *    * *
//        **      **
//        *        *

// 25.       *****
//          *   *
//         *   *
//        *   *
//       *****

package Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        pattern25(5);

    }

    static void pattern21(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    static void pattern22(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                int num = 1;
                for (int j = 1; j <= i; j++) {
                    if (num == 1) {
                        System.out.print(num + " ");
                        num--;
                    } else if (num == 0) {
                        System.out.print(num + " ");
                        num++;
                    }
                }
                System.out.println();
            } else if (i % 2 == 0) {
                int num = 0;
                for (int j = 1; j <= i; j++) {
                    if (num == 1) {
                        System.out.print(num + " ");
                        num--;
                    } else if (num == 0) {
                        System.out.print(num + " ");
                        num++;
                    }
                }
                System.out.println();
            }
        }
    }

    static void pattern24(int n) {

        for (int i = 1; i <= 2 * n; i++) {
            for (int j = 1; j <= 2 * n; j++) {
                if (j == 1 || j == 2 * n || j == i || j == 2 * n - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    static void pattern25(int n) {
        for (int i = 1; i <= n; i++) {
            int c = n - i;
            for (int j = 1; j <= c; j++) {
                System.out.print(" ");
            }
            for (int k = c + 1; k <= 2 * n - i; k++) {
                if (i == 1 || i == n || k == c + 1 || k == 2 * n - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

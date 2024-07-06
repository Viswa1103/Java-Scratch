// 26.   1 1 1 1 1 1
//       2 2 2 2 2
//       3 3 3 3
//       4 4 4
//       5 5
//       6

// 27.   1 2 3 4  17 18 19 20
//         5 6 7  14 15 16
//           8 9  12 13
//             10 11

// 28.      *
//         * *
//        * * *
//       * * * *
//      * * * * *
//       * * * *
//        * * *
//         * *
//          *

// 29.      
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *

// 30.         1
//           2 1 2
//         3 2 1 2 3
//       4 3 2 1 2 3 4
//     5 4 3 2 1 2 3 4 5

package Patterns;

public class Pattern6 {
    public static void main(String[] args) {
        pattern28(5);

    }

    static void pattern26(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void pattern27(int n) {
        int f = 1;
        int sh = n * n + 1;
        for (int i = 1; i <= n; i++) {
            int sp = i - 1;
            for (int j = 1; j <= sp; j++) {
                System.out.print("  ");
            }
            for (int k = i; k <= 2 * n - i + 1; k++) {
                if (k < n) {

                    System.out.print(f + " ");
                    f++;
                } else if (k == n) {
                    if (i == n) {
                        System.out.print(f + " ");
                        f++;
                    } else {
                        System.out.print(f + " ");
                        f++;
                        System.out.print(" ");
                    }

                } else if (k > n) {
                    System.out.print(sh + " ");
                    sh++;
                }
            }
            System.out.println();
            sh = sh - (2 * n - i - sp);
        }
    }

    static void pattern28(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int sp = i < n ? n - i : i - n;
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            int c = i <= n ? n + i - 1 : 2 * n - ((i - n) + 1);
            for (int k = i <= n ? sp + i : 5; k <= c; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

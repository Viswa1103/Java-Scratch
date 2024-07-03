// 16.           1
//             1   1
//           1   2   1  
//         1   3   3   1  
//       1   4   6   4   1

// 17.      1
//         212
//        32123
//       4321234
//        32123
//         212
//          1

// 18.   **********
//       ****  ****
//       ***    ***
//       **      **
//       *        *
//       *        *
//       **      **
//       ***    ***
//       ****  ****
//       **********

// 19.    *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *

// 20.    ****
//        *  *
//        *  *
//        *  *
//        ****

package Patterns;

public class Patterns4 {
    public static void main(String[] args) {
        pattern17(5);

    }

    static void pattern16(int n) {
        for (int i = 1; i <= n; i++) {
            int c = (2 * n - (2 * i));
            for (int j = 1; j <= c; j++) {
                System.out.print(" ");
            }
            // int s = 2 * n + 2 * i - 3;
            int value = 1;
            for (int k = 0; k < i; k++) {
                // if (k == c + 1 || k == s - 1) {
                // System.out.print("1");
                // } else {
                // System.out.print(" ");
                // }
                System.out.print(value + "   "); // Print the current element with spaces
                // Update the value using binomial coefficient logic
                value = value * (i - k - 1) / (k + 1);
            }
            System.out.println();
        }
    }

    static void pattern17(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int s = i < n ? n - i : i - n;
            for (int j = 1; j <= s; j++) {
                System.out.print(" ");
            }
            int c = i < n ? n + i - 1 : 2 * n - ((i - n) + 1);
            int uf = i;
            int us = 2;
            int lf = 2 * n - i;
            int ls = 2;
            for (int k = s + 1; k <= c; k++) {
                if (i <= n) {
                    if (k <= n) {
                        if (k == s + 1 || k == c) {
                            System.out.print(i);
                            uf--;
                        } else {
                            System.out.print(uf);
                            uf--;
                        }
                    } else if (k > n) {
                        if (k == c) {
                            System.out.print(i);
                            us--;
                        } else {
                            System.out.print(us);
                            us++;
                        }
                    }
                } else if (i > n) {
                    if (k <= n) {
                        if (k == s + 1) {
                            System.out.print(2 * n - i);
                            lf--;
                        } else {
                            System.out.print(lf);
                            lf--;
                        }
                    } else if (k > n) {
                        if (k == c) {
                            System.out.print(2 * n - i);
                            ls--;

                        } else {
                            System.out.print(ls);
                            ls++;
                        }
                    }
                }
            }
            System.out.println();
        }
    }

}

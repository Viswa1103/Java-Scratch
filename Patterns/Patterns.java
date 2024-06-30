
// 1.  *****
//     *****
//     *****
//     *****
//     *****

// 2.  *
//     **
//     ***
//     ****
//     *****

// 3.  *****
//     ****
//     ***
//     **
//     *

// 4.  1
//     1 2
//     1 2 3
//     1 2 3 4
//     1 2 3 4 5

// 5.  *
//     **
//     ***
//     ****
//     *****
//     ****
//     ***
//     **
//     *

package Patterns;

public class Patterns {
    public static void main(String[] args) {
        pattern5(5);

    }

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }

    static void pattern5(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int c = i > n ? 2 * n - i : i;
            for (int j = 1; j <= c; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}

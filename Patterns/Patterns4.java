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
        pattern16(5);

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

}

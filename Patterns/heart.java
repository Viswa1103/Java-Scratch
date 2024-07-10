//   ***   ***
//  ***** *****
// *************
//  ***********
//   *********
//    *******
//     *****
//      ***
//       *

package Patterns;

public class heart {
    public static void main(String[] args) {
        h(5);
    }

    private static void h(int n) {

        for (int i = 1; i <= n / 2; i++) {
            int fc = i <= 1 ? (2 * n + i) - 2 * n + 1 : ((2 * n + i) - 2 * n + 1) - i;
            for (int j = 1; j <= fc; j++) {
                System.out.print(" ");
            }
            for (int k = fc + 1; k <= 2 * n + i; k++) {
                if (k == n + i || (i == 1 && k > 5 && k < 9)) {
                    System.out.print(" ");
                } else {

                    System.out.print("*");
                }
            }
            System.out.println();
        }
        int star = 2 * n + (n / 2) + 1;
        for (int i = 1; i <= 2 * n - 3; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= star; k++) {
                System.out.print("*");
            }
            System.out.println();
            star--;
        }
    }

}

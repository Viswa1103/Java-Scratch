package SimplePrograms;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArm(n));
    }

    static boolean isArm(int n) {
        int o = n;
        int sum = 0;
        while (n > 0) {

            int rev = n % 10;

            n = n / 10;
            sum = sum + rev * rev * rev;

        }
        if (sum == o) {
            return true;
        } else
            return false;
    }
}

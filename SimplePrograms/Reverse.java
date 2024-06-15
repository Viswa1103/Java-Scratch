package SimplePrograms;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int rev = 0;
        int ans = 0;
        while (n > 0) {
            rev = n % 10;

            n = n / 10;
            ans = ans * 10 + rev;

        }
        System.out.println(ans);
        sc.close();

    }

}

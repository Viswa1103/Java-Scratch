package Recursion.Easy;

import java.util.Scanner;

public class fibo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fact(n));
    }

    private static int fact(int n) {
        if (n < 2) {
            return n;
        }

        int ans = 0;
        ans = fact(n - 1) + fact(n - 2);
        return ans;
    }

}

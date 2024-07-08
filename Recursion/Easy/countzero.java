package Recursion.Easy;

public class countzero {
    public static void main(String[] args) {
        System.out.println(zero(30204));
    }

    static int zero(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int i) {
        if (n == 0) {
            return i;
        }
        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, i + 1);
        } else {
            return helper(n / 10, i);
        }

    }
}

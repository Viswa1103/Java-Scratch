package Recursion.Problems;

public class dice {

    public static void main(String[] args) {
        d("", 4);

    }

    static void d(String p, int t) {
        if (t == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= t; i++) {
            d(p + i, t - i);
        }

    }
}

package Recursion.Easy;

public class oneton {
    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int n) {
        int num = 1;
        if (n == 1) {
            System.out.println(n);
            return;
        }
        fun(n - 1);
        System.out.println(n);
    }
}

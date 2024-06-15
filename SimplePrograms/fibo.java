package SimplePrograms;

import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 2;
        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
            System.out.print(b + " ");

        }
        // System.out.println(b);
        sc.close();

    }

}

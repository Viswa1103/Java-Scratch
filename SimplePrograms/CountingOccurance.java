package SimplePrograms;

import java.util.Scanner;

public class CountingOccurance {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the number to check");
        int c = sc.nextInt();
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == c) {
                count++;
            }
            n = n / 10;

        }
        System.out.println(count);
        sc.close();

    }
}

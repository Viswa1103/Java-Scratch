package SimplePrograms;

import java.util.Scanner;

public class maxonesiii {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        System.out.println(longestOnes(arr, 2));
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr1 = str.split(" ");
        int[] res = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            res[i] = Integer.parseInt(arr1[i]);

        }
        for (int i : res) {
            System.out.print(i + " ");
        }
        sc.close();

    }

    public static int longestOnes(int[] nums, int k) {

        int i = 0;
        int j = 0;
        int max = 0;
        int zero = 0;

        while (j < nums.length) {
            if (nums[j] == 0) {
                zero++;

            }

            if (zero > k) {
                if (nums[i] == 0) {
                    zero--;
                }
                i++;
            }

            max = Math.max(max, j - i + 1);
            j++;
        }

        return max;

    }
}

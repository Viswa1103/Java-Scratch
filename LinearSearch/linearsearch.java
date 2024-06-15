package LinearSearch;

import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enther the number of elements in array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elemnent:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the search element:");
        int t = sc.nextInt();
        int res = ls(arr, t) + 1;
        if (res != -1) {
            System.out.println("Element is found in the " + res + " position");
        } else {
            System.out.println("element is not found");
        }
        sc.close();
    }

    static int ls(int[] arr, int t) {
        if (arr.length == 0) {
            return -1;

        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == t) {
                return i;
            }

        }
        return -1;
    }

}

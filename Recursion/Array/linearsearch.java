package Recursion.Array;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(search(arr, 1, 0));
    }

    static boolean search(int[] arr, int t, int i) {
        if (i == arr.length) {
            return false;
        }

        return arr[i] == t || search(arr, t, i + 1);
    }
}

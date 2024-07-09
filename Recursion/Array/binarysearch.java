package Recursion.Array;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int s = 0;
        int e = arr.length - 1;
        System.out.println(search(arr, s, e, 4));
    }

    static int search(int[] arr, int s, int e, int t) {
        int mid = s + (e - s) / 2;
        if (s > e) {
            return -1;
        }
        if (arr[mid] == t) {
            return mid;
        }
        if (arr[mid] < t) {

            return search(arr, mid + 1, e, t);
        }
        return search(arr, s, mid - 1, t);
    }
}

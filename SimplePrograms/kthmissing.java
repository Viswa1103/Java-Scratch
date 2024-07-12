package SimplePrograms;

public class kthmissing {
    public static void main(String[] args) {

        int[] arr = { 2, 3, 4, 7, 11 };
        int k = 5;
        int result = findKthPositive(arr, k);
        System.out.println(result); // Expected: 9
    }

    static int findKthPositive(int[] arr, int k) {
        int currentMissing = 1;
        int missingCount = 0;
        int index = 0;

        while (missingCount < k) {
            if (index < arr.length && arr[index] == currentMissing) {
                index++;
            } else {
                missingCount++;
                if (missingCount == k) {
                    return currentMissing;
                }
            }
            currentMissing++;
        }
        return -1;
    }

}

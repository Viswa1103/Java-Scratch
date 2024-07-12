package SimplePrograms;

public class smallerelement {
    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };
        smallerNumbersThanCurrent(nums);

    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int c = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    c++;

                }
            }
            res[i] = c;

        }
        return res;

    }

}

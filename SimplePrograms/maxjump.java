package SimplePrograms;

public class maxjump {

    public static void main(String[] args) {
        int[] nums = { 3, 2, 1, 0, 4 };
        canJump(nums);

    }

    static public boolean canJump(int[] nums) {

        int gas = 0;
        int n = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (i > gas) {
                return false;
            }
            gas = Math.max(gas, i + nums[i]);
            if (gas >= n - 1) {
                return true;
            }

        }
        return false;
    }
}

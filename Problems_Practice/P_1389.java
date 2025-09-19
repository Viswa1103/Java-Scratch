package Problems_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// import MazeProblem.returnpathaslist;

public class P_1389 {
    public static void main(String[] args) {

        int nums[] = { 0, 1, 2, 3, 4 };
        int index[] = { 0, 1, 2, 2, 1 };
        System.out.println(Arrays.toString(createTargetArray(nums, index)));

    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int res[] = new int[nums.length];

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            res[i] = list.get(i);
        }

        // for (int i = 0; i < nums.length; i++) {

        // res[index[i]] = nums[i];
        // }

        return res;
    }

}

package SimplePrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayToInteger {
    public static void main(String[] args) {
        int[] num = { 2, 1, 5 };
        int k = 806;
        System.out.println(addToArrayForm(num, k));
    }

    static List<Integer> addToArrayForm(int[] num, int k) {
        int sum = 0;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            sum = sum * 10 + num[i];
        }
        int f = sum + k;
        // System.out.print(f);
        while (f > 0) {
            int rem = f % 10;
            res.add(rem);
            f /= 10;
        }
        Collections.reverse(res);
        return res;

    }

}

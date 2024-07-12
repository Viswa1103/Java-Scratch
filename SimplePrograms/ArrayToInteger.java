package SimplePrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayToInteger {
    public static void main(String[] args) {
        int[] num = { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
        int k = 1;
        System.out.println(addToArrayForm(num, k));
    }

    static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();
        int carry = k;
        int i = num.length - 1;

        while (i >= 0 || carry > 0) {
            if (i >= 0) {
                carry += num[i];
                i--;
            }
            res.add(carry % 10);
            carry /= 10;
        }

        Collections.reverse(res);
        return res;
    }

}

import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class Solution {
    public static void Solution(Integer[] A) {
        HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();

        for (Integer i = 0; i < A.length; ++i) {
            Integer curr = A[i];
            Integer memoValue = memo.get(curr);
            if (memoValue == null) {
                memo.put(curr, 0);
            } else {
                memo.put(curr, memoValue + 1);
            }
        }

        Integer result;
        memo.forEach((k, v) -> {
            if (v == 0) {
                result = k;
            }
        });
        System.out.println(result);
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 3, 2, 3, 4};
        Solution(nums);
    }
}

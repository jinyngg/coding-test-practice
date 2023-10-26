package etc.slidng_window.prob01;

import java.util.Arrays;

public class Solution {

    public int solution(int[] nums, int k) {
        int sumOfSubsequences = 0;
        int num = nums.length - k;
        for (int i = 0; i < num; i++) {
            sumOfSubsequences += nums[i];
        }

        int sum = Arrays.stream(nums).sum();
        int min = sumOfSubsequences;

        for (int i = num; i < nums.length; i++) {
            sumOfSubsequences = sumOfSubsequences + nums[i] - nums[i - num];
            min = Math.min(min, sumOfSubsequences);
        }
        return sum - min;
    }

    public static void main(String[] args) {
        /*
        nums : [2, 3, 7, 1, 2, 1, 5]
        k : 4
        answer : 17
         */
        Solution T = new Solution();
        int k = 4;
//        int k = 5;
        int[] arr = new int[]{2, 3, 7, 1, 2, 1, 5};
//        int[] arr = new int[]{1, 2, 3, 5, 6, 7, 1, 3, 9};
        System.out.println(T.solution(arr, k));
    }
}

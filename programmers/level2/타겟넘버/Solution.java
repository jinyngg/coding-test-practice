package programmers.level2.타겟넘버;

public class Solution {

    public static int count;

    public int solution(int[] numbers, int target) {
        int answer = 0;
        count = 0;

        dfs(numbers, target, 0, 0);
        answer = count;

        return answer;
    }

    public void dfs(int[] numbers, int target, int depth, int sum) {
        if (depth == numbers.length) {
            if (target == sum) {
                count++;
            }
            return;
        }

        int positive = sum + numbers[depth];
        int negative = sum - numbers[depth];

        dfs(numbers, target, depth + 1, positive);
        dfs(numbers, target, depth + 1, negative);
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        T.solution(new int[]{1, 1, 1, 1, 1}, 3);
    }
}

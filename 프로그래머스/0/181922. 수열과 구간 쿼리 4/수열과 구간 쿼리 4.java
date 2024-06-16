public class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            for (int i = s; i <= e; i++) {
                if (k != 0 && i % k == 0) {
                    arr[i] += 1;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {
            {0, 4, 1},
            {0, 3, 2},
            {0, 3, 3}
        };
        int[] result = sol.solution(arr, queries);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

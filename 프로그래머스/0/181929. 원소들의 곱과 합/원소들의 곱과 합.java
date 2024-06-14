import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int mul = Arrays.stream(num_list)
                            .reduce(1, (a, b) -> a * b);
        
        int sum = Arrays.stream(num_list)
                        .sum();
        
        int sumSquared = sum * sum;
        
        return mul < sumSquared ? 1 : 0;
    }
}
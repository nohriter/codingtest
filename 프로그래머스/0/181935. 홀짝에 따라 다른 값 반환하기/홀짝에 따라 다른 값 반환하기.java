import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n % 2 == 1) {
            answer = IntStream.rangeClosed(1, n)
                        .filter(i -> i % 2 == 1)
                        .sum();
        } else {
            answer = IntStream.rangeClosed(1, n)
                        .filter(i -> i % 2 == 0)
                        .map(i -> i * i)
                        .sum();
        }
        
        return answer;
    }
}
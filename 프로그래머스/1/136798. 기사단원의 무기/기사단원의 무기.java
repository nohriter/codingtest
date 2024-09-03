class Solution {
    public int solution(int number, int limit, int power) {
        int totalWeight = 0;

        for (int i = 1; i <= number; i++) {
            int divisorCount = getDivisorCount(i);
            
            if (divisorCount > limit) {
                totalWeight += power;
            } else {
                totalWeight += divisorCount;
            }
        }

        return totalWeight;
    }
    
    private int getDivisorCount(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (i != n / i) {
                    count++;
                }
            }
        }
        return count;
    }
}
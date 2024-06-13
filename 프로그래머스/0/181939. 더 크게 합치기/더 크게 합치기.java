class Solution {
    public int solution(int a, int b) {
        String first = String.valueOf(a) + String.valueOf(b);
        String second = String.valueOf(b) + String.valueOf(a);
                
        return Math.max(Integer.parseInt(first), Integer.parseInt(second));
    }
}
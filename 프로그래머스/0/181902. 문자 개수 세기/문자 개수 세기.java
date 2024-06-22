class Solution {
    public int[] solution(String my_string) {
        int[] counts = new int[52];  // 결과를 저장할 배열
        
        for (char c : my_string.toCharArray()) {
            if (Character.isUpperCase(c)) {
                counts[c - 'A']++;
            } else if (Character.isLowerCase(c)) {
                counts[c - 'a' + 26]++;
            }
        }
        
        return counts;
    }
}
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder result = new StringBuilder();
        Set<Character> skipSet = new HashSet<>();
        
        // skip 문자열을 Set으로 변환하여 탐색 효율성 향상
        for (char c : skip.toCharArray()) {
            skipSet.add(c);
        }
        
        // 문자열 s의 각 문자에 대해 변환 진행
        for (char c : s.toCharArray()) {
            char newChar = c;
            int steps = 0;
            
            while (steps < index) {
                newChar++;
                
                if (newChar > 'z') {
                    newChar = 'a';
                }
                
                if (!skipSet.contains(newChar)) {
                    steps++;
                }
            }
            
            result.append(newChar);
        }
        
        return result.toString();
    }
}
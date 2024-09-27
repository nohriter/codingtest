import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String X, String Y) {
        Map<Character, Integer> countX = new HashMap<>();
        Map<Character, Integer> countY = new HashMap<>();
        
        for (char ch : X.toCharArray()) {
            countX.put(ch, countX.getOrDefault(ch, 0) + 1);
        }
        
        for (char ch : Y.toCharArray()) {
            countY.put(ch, countY.getOrDefault(ch, 0) + 1);
        }
        
        StringBuilder result = new StringBuilder();
        
        for (char num = '9'; num >= '0'; num--) {
            if (countX.containsKey(num) && countY.containsKey(num)) {
                int commonCount = Math.min(countX.get(num), countY.get(num));
                for (int i = 0; i < commonCount; i++) {
                    result.append(num);
                }
            }
        }
        
        if (result.length() == 0) {
            return "-1";
        } else if (result.charAt(0) == '0') {
            return "0";
        }
        
        return result.toString();
    }
}

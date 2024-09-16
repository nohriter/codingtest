import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> minPress = new HashMap<>();
        
        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                char ch = keymap[i].charAt(j);
                minPress.put(ch, Math.min(minPress.getOrDefault(ch, Integer.MAX_VALUE), j + 1));
            }
        }
        
        int[] result = new int[targets.length];
        
        for (int i = 0; i < targets.length; i++) {
            int totalPress = 0;
            boolean canBeTyped = true;
            
            for (char ch : targets[i].toCharArray()) {
                if (!minPress.containsKey(ch)) {
                    canBeTyped = false;
                    break;
                }
                totalPress += minPress.get(ch);
            }
            
            if (canBeTyped) {
                result[i] = totalPress;
            } else {
                result[i] = -1;
            }
        }
        
        return result;
    }
}
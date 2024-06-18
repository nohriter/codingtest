import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {        
        List<Integer> list = new ArrayList<>();
        
        for(String str : intStrs) {
            String tempStr = str.substring(s, s+l);
            int val = Integer.parseInt(tempStr);
            if(val > k) {
                list.add(val);
            }
        }
        
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
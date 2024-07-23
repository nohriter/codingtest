import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int v : arr) {
            for(int i=0; i<v; i++) {
                list.add(v);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
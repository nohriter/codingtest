import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int count = 0;
        
        List<Integer> arr = new ArrayList<>();
        
        for(int i=l; i<=r; i++) {
            if(incudeFiveAndJero(i)){
                arr.add(i);
            }
        }
        if(arr.size() == 0) {
            int[] minus = new int[1];
            minus[0] = -1;
            return minus;
        }
        
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public static boolean incudeFiveAndJero(int i) {
        String str = String.valueOf(i);
        
        char[] cArr = str.toCharArray();
        
        for(char c : cArr) {
            if(c != '5' && c != '0') {
                return false;
            }
        }
        
        return true;
    } 
}
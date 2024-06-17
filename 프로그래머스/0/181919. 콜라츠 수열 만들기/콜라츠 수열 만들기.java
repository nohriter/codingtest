import java.util.*;

class Solution {
    
    public static List<Integer> list = new ArrayList<>();

    public int[] solution(int n) {
        list.add(count(n));
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public static int count(int n) {
        if(n == 1) {
            return n;
        }
        
        if(n % 2 == 0) {
            list.add(n);
            return count(n / 2);
        }
        
        list.add(n);
        return count(3 * n + 1);
    }
}
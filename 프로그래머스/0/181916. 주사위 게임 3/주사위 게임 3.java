import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {        
        Map<Integer, Integer> countMap = new HashMap<>();
        
        countMap.put(a, countMap.getOrDefault(a, 0) + 1);
        countMap.put(b, countMap.getOrDefault(b, 0) + 1);
        countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        countMap.put(d, countMap.getOrDefault(d, 0) + 1);
        
        int size = countMap.size();
        
        if(size == 1) {
            int p = a;
            return 1111 * p;
        } else if (size == 2) {
            int[] keys = new int[2];
            int[] values = new int[2];
            
            int idx = 0;
            for(Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
                keys[idx] = entry.getKey();
                values[idx] = entry.getValue();
                    
                idx++;
            }
            
            int p = keys[0];
            int q = keys[1];
            int pCnt = values[0];
            int qCnt = values[1];
            
            if(pCnt == 3 || qCnt == 3) {
                int pVal = pCnt == 3 ? p : q;
                int qVal = pCnt == 3 ? q : p;
                return (int) Math.pow((10 * pVal + qVal), 2);
            } else {
                return (p + q) * Math.abs(p - q);
            }
        } else if(size == 3) {
            int p = 0, q = 0, r = 0;

            for(Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
                if(entry.getValue() == 2) {
                    p = entry.getKey();
                } else if (entry.getValue() == 1) {
                    if(q == 0) {
                        q = entry.getKey();
                    } else {
                        r = entry.getKey();
                    }
                }
            }
            return q * r;
        } else {
            return Math.min(Math.min(a, b), Math.min(c, d));
        }
    
    }
}
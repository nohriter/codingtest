import java.util.*;

public class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        
        for (int i = 0; i < query.length; i++) {
            int index = query[i];
            if (i % 2 == 0) {
                list = list.subList(0, index + 1);
            } else {
                list = list.subList(index, list.size());
            }
        }
        
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}
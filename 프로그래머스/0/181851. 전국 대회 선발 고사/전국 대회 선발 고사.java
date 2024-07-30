import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<int[]> students = new ArrayList<>();
        
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                students.add(new int[]{rank[i], i});
            }
        }
        
        students.sort(Comparator.comparingInt(a -> a[0]));
        
        int a = students.get(0)[1];
        int b = students.get(1)[1];
        int c = students.get(2)[1];
        
        return 10000 * a + 100 * b + c;
    }
}
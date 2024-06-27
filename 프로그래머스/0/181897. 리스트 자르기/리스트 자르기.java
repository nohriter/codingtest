import java.util.*;

class Solution {
    
    private static final List<Integer> list = new ArrayList<>();
    
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        switch(n) {
            case 1:
                repeat(0, b, 1, num_list);
                break;
            case 2:
                repeat(a, num_list.length, 1, num_list);
                break;
            case 3:
                repeat(a, b, 1, num_list);
                break;
            case 4:
                repeat(a, b, c, num_list);
                break;
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public static void repeat(int a, int b, int c, int[] num_list) {
        if(b == num_list.length) {
            b--;
        }
        
        for(int i=a; i<=b; i+=c) {
            list.add(num_list[i]);
        }
    }
}
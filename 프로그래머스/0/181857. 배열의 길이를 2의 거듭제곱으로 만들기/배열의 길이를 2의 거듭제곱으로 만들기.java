import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int size = arr.length;
        
        int newSize = 1;
        while(newSize < size) {
            newSize *= 2;
        }
        
        int[] answer = new int[newSize];
        
        for(int i=0; i < size; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}
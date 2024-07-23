import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        Stack<Integer> stack = new Stack<>();
        
        for(int num : arr) {
            if(stack.size() == k) {
                break;
            }
            
            if(stack.contains(num)) {
                continue;
            } else {
                stack.push(num);
            }
        }
 
        while(stack.size() < k) {
            stack.push(-1);
        }
        
        return stack.stream().mapToInt(i -> i).toArray();
    }
}
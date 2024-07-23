import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        stack.add(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            if(!stack.isEmpty() && stack.peek() == arr[i]) {
                stack.pop();
            } else {
                stack.add(arr[i]);
            }
        }
        
        if(stack.isEmpty()) {
            stack.push(-1);
        }
        
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        
        char[] crr = answer.toCharArray();
        
        for(int[] arr : queries) {
            int left = arr[0];
            int right = arr[1];
            
            while(left < right) {
                char temp = crr[left];
                crr[left] = crr[right];
                crr[right] = temp;
                left++;
                right--;
            }
            
        }
        
        return new String(crr);
    }
}
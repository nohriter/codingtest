class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        char[] cArr = my_string.toCharArray();
        
        for(int i=0; i<index_list.length; i++) {
            int idx = index_list[i];
            answer += cArr[idx];
        }
        
        return answer;
    }
}
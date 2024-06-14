class Solution {
    public String solution(String code) {
        String answer = "";
        
        char[] arr = code.toCharArray();
        int mode = 0;
        
        for(int i=0; i<arr.length; i++) {
            if(mode == 0) {
                if(arr[i] != '1' && i % 2 == 0) {
                    answer += arr[i];
                }
                if(arr[i] == '1') {
                    mode = 1;
                }
            } else {
                if(arr[i] != '1' && i % 2 != 0) {
                    answer += arr[i];
                }
                if(arr[i] == '1') {
                    mode = 0;
                }
            }
        }
        
        return answer.equals("") ? "EMPTY" : answer;
    }
}
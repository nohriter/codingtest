class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        int mLen = my_string.length();
        int pLen = is_prefix.length();
        int cnt = 0;
        
        for(int i=0; i<pLen; i++) {
            if(mLen < pLen) {
                break;
            }
            if(is_prefix.charAt(i) == my_string.charAt(i)) {
                cnt++;
            }
        }
        
        if(cnt == is_prefix.length()) {
            answer++;
        }
        
        return answer;
    }
}
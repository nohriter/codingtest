class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        myString = myString.toUpperCase();
        pat = pat.toUpperCase();
        
        answer = myString.indexOf(pat) >= 0 ? 1 : 0;
        
        return answer;
    }
}
class Solution {
    public int solution(String myString, String pat) {
        int cnt = 0;
        for(int i=0; i < myString.length() - pat.length() + 1; i++) {
            String temp = myString.substring(i, i + pat.length());
            if(temp.equals(pat)) {
                cnt++;
            }
        }
        return cnt;
    }
}
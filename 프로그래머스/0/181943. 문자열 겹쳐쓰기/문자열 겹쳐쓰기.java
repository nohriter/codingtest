class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        int mLen = my_string.length();
        int oLen = overwrite_string.length();
        
        String a = my_string.substring(0, s);
        String b = my_string.substring(oLen + s, mLen);
        
        return a + overwrite_string + b;
    }
}
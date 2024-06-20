class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i += m) {
            String row = my_string.substring(i, i + m);
            result.append(row.charAt(c - 1));
        }
        
        return result.toString();
    }
}
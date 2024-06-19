class Solution {
    public String solution(String my_string, int s, int e) {
        String front = my_string.substring(0, s);
        String middle = my_string.substring(s, e + 1);
        String end = my_string.substring(e + 1);
        
        String reversedMiddle = new StringBuilder(middle).reverse().toString();
        
        String result = front + reversedMiddle + end;
        
        return result;
    }
}
class Solution {
    public String solution(String myString) {        
        char[] cArr = myString.toCharArray();
        
        for(int i = 0; i < cArr.length; i++) {
            if(cArr[i] == 'a' || cArr[i] == 'A') {
                cArr[i] = Character.toUpperCase(cArr[i]);
            } else {
                cArr[i] = Character.toLowerCase(cArr[i]);
            }
        }
        
        return String.valueOf(cArr);
    }
}
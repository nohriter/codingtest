class Solution {
    public int solution(String myString, String pat) {        
        char[] cArr = myString.toCharArray();
        
        for(int i=0; i<cArr.length; i++) {
            if(cArr[i] == 'A') {
                cArr[i] = 'B';
            } else {
                cArr[i] = 'A';
            }
        }
        
        String str = String.valueOf(cArr);
        
        System.out.print(str);
        
        return str.contains(pat) ? 1 : 0;
    }
}
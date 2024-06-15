class Solution {
    public int solution(int n, String control) {        
        char[] cArr = control.toCharArray();
        
        int[] arr = {1, -1, 10, -10};
        
        for(char c : cArr) {
            n += arr[change(c)];
        }
        
        return n;
    }
    
    public static int change(char c) {
        switch(c) {
            case 'w': return 0;
            case 's': return 1;
            case 'd': return 2;
            case 'a': return 3;
        }
        return 0;
    }
}
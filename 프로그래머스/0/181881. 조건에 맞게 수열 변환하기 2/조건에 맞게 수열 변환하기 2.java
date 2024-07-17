import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int[] compare;
        int index = 0;
        
        while(true) {
            compare = Arrays.copyOf(arr, arr.length);
            for(int i=0; i<arr.length; i++) {
                int value = arr[i];
                if(value >= 50 && value % 2 == 0) {
                    arr[i] /= 2;
                }else if(value < 50 && value % 2 != 0) {
                    arr[i] = value * 2 + 1;
                }
            }
            
            if(Arrays.equals(arr, compare)){
                break;
            }
            
            index++;
        }

        return index;
    }
}
class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        int startIdx = -1;
        int lastIdx = -1;
        int count = 0;
        
        for(int i=0; i<arr.length; i++) {
            if(count == 0 && arr[i] == 2) {
                startIdx = i;
                count++;
            }
            if(count > 0 && arr[i] == 2) {
                lastIdx = i;
            }
        }
        
        if(startIdx < 0 && lastIdx < 0) {
            return new int[]{-1};
        } else if(startIdx == lastIdx) {
            return new int[]{arr[startIdx]};
        } else {
            int size = lastIdx - startIdx + 1;
            answer = new int[size];
            for(int i=0; i<answer.length; i++) {
                answer[i] = arr[startIdx++];
            }
        }
        
        System.out.println("start: "+ startIdx);
        System.out.println("end: "+ lastIdx);
        
        return answer;
    }
}
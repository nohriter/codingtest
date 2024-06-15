class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        int idx = 0;
        
        for(int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            int min = Integer.MAX_VALUE;
                        
            for(int i=s; i<=e; i++) {
                if(arr[i] > k) {
                    min = Math.min(arr[i], min);
                }
            }
            
            answer[idx++] = (min == Integer.MAX_VALUE) ? -1 : min;
        }
        
        return answer;
    }
}
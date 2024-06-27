class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int totalLength = 0;
        
        for(int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            totalLength += end - start + 1;
        }
        
        int[] result = new int[totalLength];
        int resultIndex = 0;
        
        for(int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            for(int i = start; i <= end; i++) {
                result[resultIndex++] = arr[i];
            }
        }
        
        return result;
    }
}
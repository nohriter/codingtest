class Solution {
    public int[][] solution(int[][] arr) {
        int rowCount = arr.length;       
        int colCount = arr[0].length;    

        int maxSize = Math.max(rowCount, colCount);
        int[][] result = new int[maxSize][maxSize];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                result[i][j] = arr[i][j];
            }
        }

        return result;
    }
}
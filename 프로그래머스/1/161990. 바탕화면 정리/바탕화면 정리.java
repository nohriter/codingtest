class Solution {
    public int[] solution(String[] wallpaper) {
 int lux = Integer.MAX_VALUE;  // 최소 세로 좌표
        int luy = Integer.MAX_VALUE;  // 최소 가로 좌표
        int rdx = Integer.MIN_VALUE;  // 최대 세로 좌표
        int rdy = Integer.MIN_VALUE;  // 최대 가로 좌표

        // 모든 파일 위치 탐색
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    lux = Math.min(lux, i);  
                    luy = Math.min(luy, j); 
                    rdx = Math.max(rdx, i);  
                    rdy = Math.max(rdy, j); 
                }
            }
        }

        return new int[]{lux, luy, rdx + 1, rdy + 1};
    }
}
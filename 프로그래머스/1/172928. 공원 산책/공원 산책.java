public class Solution {
    public int[] solution(String[] park, String[] routes) {
        int height = park.length;
        int width = park[0].length();
        int[] start = new int[2];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (park[i].charAt(j) == 'S') {
                    start[0] = i;
                    start[1] = j;
                    break;
                }
            }
        }

        int[][] directions = {
            {-1, 0}, // N
            {1, 0},  // S
            {0, -1}, // W
            {0, 1}   // E
        };

        for (String route : routes) {
            String[] parts = route.split(" ");
            String dir = parts[0];
            int dist = Integer.parseInt(parts[1]);

            int dx = 0, dy = 0;
            if (dir.equals("N")) {
                dx = directions[0][0];
                dy = directions[0][1];
            } else if (dir.equals("S")) {
                dx = directions[1][0];
                dy = directions[1][1];
            } else if (dir.equals("W")) {
                dx = directions[2][0];
                dy = directions[2][1];
            } else if (dir.equals("E")) {
                dx = directions[3][0];
                dy = directions[3][1];
            }

            int nx = start[0];
            int ny = start[1];
            boolean isValid = true;

            for (int i = 0; i < dist; i++) {
                nx += dx;
                ny += dy;

                if (nx < 0 || nx >= height || ny < 0 || ny >= width || park[nx].charAt(ny) == 'X') {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                start[0] = nx;
                start[1] = ny;
            }
        }

        return start;
    }
}
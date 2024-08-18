import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
 Map<String, Integer> playerIndices = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            playerIndices.put(players[i], i);
        }
        
        for (String calling : callings) {
            int currentIndex = playerIndices.get(calling);

            if (currentIndex > 0) {
                String frontPlayer = players[currentIndex - 1];
                players[currentIndex - 1] = players[currentIndex];
                players[currentIndex] = frontPlayer;

                playerIndices.put(calling, currentIndex - 1);
                playerIndices.put(frontPlayer, currentIndex);
            }
        }

        return players;
    }
}
import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playerPositions = new HashMap<>();
        
        // 각 선수의 초기 위치를 HashMap에 저장
        for (int i = 0; i < players.length; i++) {
            playerPositions.put(players[i], i);
        }
        
        for (String runner : callings) {
            int pos = playerPositions.get(runner);
            
            if (pos > 0) {  // 첫 번째 위치가 아닌 경우에만 교체
                // 현재 위치의 선수와 앞 선수의 위치 교체
                String previousPlayer = players[pos - 1];
                
                players[pos] = previousPlayer;
                players[pos - 1] = runner;
                
                // 위치 업데이트
                playerPositions.put(runner, pos - 1);
                playerPositions.put(previousPlayer, pos);
            }
        }
        
        return players;
    }
}

import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        // 1. 장르별 총 재생 횟수를 저장할 해시맵
        Map<String, Integer> genrePlayCount = new HashMap<>();
        // 2. 장르별 노래 목록을 저장할 해시맵 (노래 리스트)
        Map<String, List<song>> genreSongs = new HashMap<>();
        
        // 3. 모든 노래를 순회하면서 데이터 채우기
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];
            
            // 장르별 재생 횟수 저장
            genrePlayCount.put(genre, genrePlayCount.getOrDefault(genre, 0) + play);
            
            // 장르별 노래 리스트에 노래 추가
            genreSongs.putIfAbsent(genre, new ArrayList<>());
            genreSongs.get(genre).add(new song(i, play));
        }
        
        // 4. 장르별로 재생 횟수 내림차순 정렬 (많이 재생된 장르 우선)
        List<String> genreOrder = new ArrayList<>(genrePlayCount.keySet());
        Collections.sort(genreOrder, (g1, g2) -> genrePlayCount.get(g2) - genrePlayCount.get(g1));
        
        // 5. 결과 저장할 리스트
        List<Integer> bestAlbum = new ArrayList<>();
        
        // 6. 장르별로 두 곡씩 고유 번호 선택
        for (String genre : genreOrder) {
            List<song> songs = genreSongs.get(genre);
            
            // 장르 내에서 재생 횟수 내림차순, 고유 번호 오름차순으로 정렬
            Collections.sort(songs, (s1, s2) -> {
                if (s2.getPlay() == s1.getPlay()) {
                    return s1.getId() - s2.getId(); // 재생 횟수가 같으면 고유 번호 오름차순
                }
                return s2.getPlay() - s1.getPlay(); // 재생 횟수 내림차순
            });
            
            // 최대 두 곡까지 선택
            int count = 0;
            for (song s : songs) {
                if (count == 2) break;
                bestAlbum.add(s.getId());
                count++;
            }
        }
        
        // 7. 결과 배열로 변환
        return bestAlbum.stream().mapToInt(i -> i).toArray();
    }
}

// song 클래스 정의
class song {
    private int id;    // 고유 번호
    private int play;  // 재생 횟수

    public song(int id, int play) {
        this.id = id;
        this.play = play;
    }

    public int getId() {
        return id;
    }

    public int getPlay() {
        return play;
    }
}

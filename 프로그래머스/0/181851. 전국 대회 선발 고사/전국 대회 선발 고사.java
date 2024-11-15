import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<List<Object>> list = new ArrayList<>();

        // 각 학생의 등수와 참석 여부, 인덱스를 리스트에 추가
        for (int i = 0; i < rank.length; i++) {
            list.add(List.of(rank[i], attendance[i], i));
        }

        // 등수를 기준으로 오름차순 정렬
        list.sort((e1, e2) -> {
            Integer rank1 = (Integer) e1.get(0);
            Integer rank2 = (Integer) e2.get(0);
            return rank1.compareTo(rank2);
        });

        // 참석 가능한 학생 중 상위 3명 선택
        int count = 0;
        int[] selected = new int[3];
        for (List<Object> student : list) {
            boolean canAttend = (Boolean) student.get(1);
            int index = (Integer) student.get(2);

            if (canAttend) {
                selected[count] = index;
                count++;
                if (count == 3) break;
            }
        }

        // 최종 결과 계산
        return 10000 * selected[0] + 100 * selected[1] + selected[2];
    }
}

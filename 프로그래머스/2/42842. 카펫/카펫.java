import java.util.*;
import java.lang.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        int range = yellow / 2 + 1;
        for (int yellow_row = 1; yellow_row <= range; yellow_row++) {
            if (yellow % yellow_row == 0) {
                int yellow_col = yellow / yellow_row;
                // yellow_row와 yellow_col을 기반으로 전체 카펫 크기 계산
                if (((yellow_col + 2) * (yellow_row + 2)) - yellow == brown) {
                    // 가로는 col + 2, 세로는 row + 2
                    arr.add(yellow_col + 2); // 가로
                    arr.add(yellow_row + 2); // 세로
                    break;
                }
            }
        }

        // 여기서 정렬은 불필요함
        // Collections.sort(arr, Comparator.reverseOrder());
        
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}

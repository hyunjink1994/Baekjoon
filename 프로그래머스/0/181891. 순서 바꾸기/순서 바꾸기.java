import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        
        // 배열을 List<Integer>로 변환
        List<Integer> list = Arrays.stream(num_list)
                                   .boxed()
                                   .collect(Collectors.toList());
        
        // 리스트의 하위 리스트를 생성
        List<Integer> subList1 = list.subList(n, list.size());
        List<Integer> subList2 = list.subList(0, n);
        
        // 결과 리스트 생성 및 합치기
        List<Integer> answer = new ArrayList<>(subList1);
        answer.addAll(subList2);
        
        // int 배열로 변환하여 반환
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}

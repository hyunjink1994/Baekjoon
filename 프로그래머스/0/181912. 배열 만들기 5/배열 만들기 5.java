import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();  // 수정: ArrayList로 초기화
        int end = s + l;
        
        for (int i = 0; i < intStrs.length; i++) {
            String str = intStrs[i];
            
            int a = Integer.parseInt(str.substring(s, end));  // 수정: end 사용
            
            if (a > k) {
                list.add(a);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();  // 수정: Integer::intValue 사용
    }
}

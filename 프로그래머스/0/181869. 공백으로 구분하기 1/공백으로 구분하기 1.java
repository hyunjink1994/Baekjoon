import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        List<String> list = new ArrayList<>();
        
        while (st.hasMoreTokens()) {  // hasMoreTokens()로 남은 토큰이 있는지 확인
            list.add(st.nextToken()); // nextToken()으로 다음 토큰을 가져와서 리스트에 추가
        }
        
        return list.toArray(new String[0]); // List를 String 배열로 변환하여 반환
    }
}

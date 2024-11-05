import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        
        int length = my_string.length();
        
        for (int i = 0; i < length; i++) {
            list.add(my_string.substring(i, length));
        }
        
        Collections.sort(list);  // List 정렬
        
        // List를 배열로 변환하여 반환
        String[] answer = list.toArray(new String[0]);
        
        return answer;
    }
}

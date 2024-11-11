import java.util.*;
import java.lang.*;

class Solution {
    public int[] solution(String myString) {
        List<Integer>list = new ArrayList<>();
        
        int answer = 0;
        
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i) == 'x'){
                list.add(answer);
                answer = 0;
            }
            else{
                answer++;
            }
        }
        
        list.add(answer);
        
        
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
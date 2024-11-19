import java.util.*;
import java.lang.*;
import java.math.*;

class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for(int i=0; i<order.length;i++){
            if(order[i].contains("americano")){
                answer+=4500;
                continue;
            }else if(order[i].contains("cafelatte")){
                answer+=5000;
                continue;
            }else if(order[i].contains("anything")){
                answer+=4500;
                continue;
            }
        }
        
        return answer;
    }
}
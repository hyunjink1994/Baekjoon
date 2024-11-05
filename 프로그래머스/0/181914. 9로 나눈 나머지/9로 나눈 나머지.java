import java.util.*;
import java.lang.*;

class Solution {
    public int solution(String number) {
        int answer = 0;
        
        int length = number.length();
        // System.out.println(length);
        // System.out.println(number.substring(2,3));
        
        for(int i=0; i<length; i++){
            // System.out.println(number.substring(i,i+1));
            int k = Integer.parseInt(number.substring(i,i+1));
            answer+=k;
        }
        
        
        
        return answer%9;
    }
}
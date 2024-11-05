import java.util.*;
import java.lang.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb;
        StringBuffer sbf;
        
        String answer = my_string;
        
        for(int i=0; i< queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1]+1;
            
            String front = answer.substring(0,s);
            String end = answer.substring(e,answer.length());
            
            sbf = new StringBuffer(answer.substring(s,e)).reverse();
            String middle = sbf.toString();
            
            sb = new StringBuilder();
            sb.append(front);
            sb.append(middle);
            sb.append(end);
            // System.out.println(sb.toString());
            answer = sb.toString();
        }
        
        
        
        return answer;
    }
}
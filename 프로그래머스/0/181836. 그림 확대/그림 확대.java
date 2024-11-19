import java.util.*;
import java.lang.*;
import java.math.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        int row = picture.length;
        int col = picture[0].length();
        
        String[] answer = new String[row*k];
        
        for(int i=0; i<picture.length; i++){
            String tmp = "";
            for(int j=0; j<col*k; j++){
                tmp+=picture[i].charAt(j/k);
            }
            int num = i*k;
            
            for(int l=num; l<num+k; l++){
                answer[l] = tmp;
            }
            
        }
        
        return answer;
    }
}
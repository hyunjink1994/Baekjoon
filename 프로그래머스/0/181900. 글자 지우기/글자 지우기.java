import java.util.*;
import java.lang.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        
        StringBuilder sb = new StringBuilder();
        
        int length = my_string.length();
        
        for(int i=0; i<length; i++){
            int swit = 0;
            for(int j=0; j<indices.length; j++){
                if(indices[j] == i){
                    swit = 1;
                    break;
                }
            }
            
            if(swit == 0){
                sb.append(String.valueOf(my_string.charAt(i)));
            }
            
        }
        
        
        return sb.toString();
    }
}
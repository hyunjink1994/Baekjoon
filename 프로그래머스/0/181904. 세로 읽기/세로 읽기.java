import java.util.*;
import java.lang.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        int length = my_string.length();
        int mop = length/m;
        
        
        for(int i=0; i<mop; i++){
            answer+= my_string.substring(m*i+c-1, m*i+c);
        }
        
        
        return answer;
    }
}
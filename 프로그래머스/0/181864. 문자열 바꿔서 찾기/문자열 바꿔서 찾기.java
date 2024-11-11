import java.util.*;
import java.lang.*;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String check = "";
        
        for(int i=0; i<pat.length(); i++){
            char chr = pat.charAt(i);
            if(chr == 'A'){
                check+="B";
            }else{
                check+="A";
            }
        }
        
        if(myString.contains(check)){
            answer = 1;
        }
        
        return answer;
    }
}
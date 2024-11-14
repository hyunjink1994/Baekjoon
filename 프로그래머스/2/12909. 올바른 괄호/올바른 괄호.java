import java.util.*;
import java.lang.*;


class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stk = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            char chr = s.charAt(i);
            if(stk.size() == 0){
                stk.push(chr);
                continue;
            }else if(stk.peek() == '(' && chr == ')'){
                stk.pop();
            }else{
                stk.push(chr);
            }
        }
        
        if(stk.size() == 0){
            answer = true;
        }else{
            answer = false;
        }
        
        return answer;
    }
}
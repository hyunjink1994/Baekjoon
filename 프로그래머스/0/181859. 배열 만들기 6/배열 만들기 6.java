import java.util.*;
import java.lang.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        
        for(int i=0; i<arr.length;i++){
            if(stk.size() == 0){
                stk.push(arr[i]);
                continue;
            }
            if(!stk.empty() && stk.peek() == arr[i]){
                stk.pop();
                continue;
            }
            if(!stk.empty() && stk.peek() != arr[i]){
                stk.push(arr[i]);
                continue;
            }
        }
        
        if(stk.empty()){
            stk.push(-1);
        }
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}
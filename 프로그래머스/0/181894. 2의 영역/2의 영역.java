import java.util.*;
import java.lang.*;

class Solution {
    public int[] solution(int[] arr) {
        int s = Integer.MAX_VALUE;
        int e = Integer.MIN_VALUE;
        
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 2 && s > i){
                s = i;
            }
            if(arr[i] == 2 && e <i){
                e = i;
            }
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=s; i<=e; i++){
            list.add(arr[i]);
        }
        
        
        if(list.size() == 0){
            list.add(-1);
            return list.stream().mapToInt(Integer::intValue).toArray();
        }
        
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
import java.util.*;
import java.lang.*;

class Solution {
    public int[] solution(int[] arr, int k){
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
            
            if(list.size() == k){
                break;
            }
        }
        
        if(list.size() != k){
            int n = k-list.size();
            for(int i=0; i<n; i++){
                list.add(-1);
            }
        }
    
        return list.stream().mapToInt(Integer::intValue).toArray();
        
    }
}
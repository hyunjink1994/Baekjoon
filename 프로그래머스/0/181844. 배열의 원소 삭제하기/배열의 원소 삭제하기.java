import java.util.*;
import java.lang.*;
import java.math.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i< arr.length; i++){
            list.add(arr[i]);
        }
        
        for(int i=0; i< delete_list.length; i++){
            if(list.contains(delete_list[i])){
                list.remove((Integer) delete_list[i]);
            }
        }
        
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
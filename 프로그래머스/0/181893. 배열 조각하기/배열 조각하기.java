import java.util.*;
import java.lang.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);
        }
        
        
        for(int i=0; i<query.length; i++){
            if(i%2 == 0){
                list = list.subList(0, query[i]+1);
            }else{
                int length = list.size();
                list = list.subList(query[i], length);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
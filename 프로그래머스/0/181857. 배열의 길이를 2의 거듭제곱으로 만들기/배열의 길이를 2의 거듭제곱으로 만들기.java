import java.util.*;
import java.lang.*;

class Solution {
    public int[] solution(int[] arr) {
        int n =1;
        while(n < arr.length){
            n*=2;
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<n ; i++){
            if(i< arr.length){
                list.add(arr[i]);
            }else{
                list.add(0);
            }
        }
        
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
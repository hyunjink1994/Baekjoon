import java.util.*;
import java.lang.*;

public class Solution {
    public int[] solution(int []arr) {
        
        int n = arr.length;
        
        ArrayList<Integer> arrList = new ArrayList<>();
        int tmp = Integer.MAX_VALUE;
        for(int i=0; i<n;i++){
            int a = arr[i];
            if(a == tmp){
                continue;
            }
            arrList.add(a);
            tmp = a;
        }
        
        
        
        return arrList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
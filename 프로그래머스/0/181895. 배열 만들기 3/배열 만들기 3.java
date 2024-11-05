import java.util.*;
import java.lang.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<intervals.length; i++){
            int s = intervals[i][0];
            int e = intervals[i][1];
            for(int j=s; j<=e; j++){
                list.add(arr[j]);
            }
        }
        
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
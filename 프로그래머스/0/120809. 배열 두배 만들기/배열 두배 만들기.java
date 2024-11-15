import java.util.*;
import java.math.*;
import java.lang.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<numbers.length; i++){
            list.add(numbers[i]*2);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
import java.util.*;


class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        
        ArrayList<Integer> arrList = new ArrayList<>();
        
        int length = num_list.length;
        
        for(int i=0;i<length;i++){
            arrList.add(num_list[i]);
        }
        
        Collections.sort(arrList);
        
        for(int i=0;i<5;i++){
            answer[i] = arrList.get(i);
        }
        
        
        
        return answer;
    }
}
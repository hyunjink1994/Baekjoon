import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length-5];
        
        ArrayList<Integer> arrList = new ArrayList<>();
        
        for(int i=0; i<num_list.length;i++){
            arrList.add(num_list[i]);
        }
        
        Collections.sort(arrList);
        
        System.out.println(arrList);
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i + 5);
        }
        
        return answer;
    }
}
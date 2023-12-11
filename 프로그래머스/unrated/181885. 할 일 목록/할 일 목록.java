import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> arrList = new ArrayList<>();
        
        int length = todo_list.length;
        
        for(int i=0;i<length;i++){
            if(!finished[i]){
                arrList.add(todo_list[i]);
            }
        }
        
        return arrList.toArray(new String[0]);
    }
}
import java.util.*;
import java.lang.*;

class Solution {
    public String[] solution(String[] str_list) {
        List<String> list = Arrays.asList(str_list);
        List<String> answer = new ArrayList<>();
        
        int lrswit = 0;
        int index = -1;
        
        for(int i=0; i<str_list.length; i++){
            if(str_list[i].equals("l")){
                lrswit = -1;
                index = i;
                break;
            }
            else if(str_list[i].equals("r")){
                lrswit = 1;
                index = i;
                break;
            }
        }
        
        if(lrswit == -1){
            for(int i=0; i<index; i++){
                answer.add(str_list[i]);
            }
        }
        
        if(lrswit == 1){
            for(int i=index+1; i< str_list.length; i++){
                answer.add(str_list[i]);
            }
        }
    
        
        
        return answer.toArray(new String[0]);
    }
}

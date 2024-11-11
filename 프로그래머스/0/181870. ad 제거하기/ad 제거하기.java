import java.util.*;
import java.lang.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<strArr.length; i++){
            if(strArr[i].contains("ad")){
                continue;
            }else{
                list.add(strArr[i]);
            }
        }
        
        return list.toArray(new String[0]);
    }
}
import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> arrList = new ArrayList<>();
        
        arrList.add(n);
        while(n !=1){
            if(n%2 == 0){
                n/=2;
                arrList.add(n);
            }
            else{
                n= 3*n+1;
                arrList.add(n);
            }
        }
        
        return arrList.stream().mapToInt(Integer::intValue).toArray();
    }
}
import java.lang.Math;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n%2 == 0){
            for(int i = n; i>0; i-=2){
                answer+= (int) Math.pow(i,2);
            }
        }else{
            for(int i =n; i>0; i-=2){
                answer+= i;
            }
        }
        return answer;
    }
}
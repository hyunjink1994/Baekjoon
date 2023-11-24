import java.lang.Math;
class Solution {
    public int solution(int[] num_list) {
        int answer1 = 0;
        int answer2 = 1;
        for(int i=0; i< num_list.length; i++){
            answer1+= num_list[i];
            answer2 *= num_list[i];
        }
        
        int a = (int) Math.pow(answer1, 2);
        int b = answer2;
        
        int answer = 0;
        
        if(a > b){
            answer =1;
        }
        
        return answer;
    }
}
class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        int length = num_str.length();
        
        for(int i=0; i<length; i++){
            answer += Integer.parseInt(num_str.substring(i,i+1));
        }
        
        
        return answer;
    }
}
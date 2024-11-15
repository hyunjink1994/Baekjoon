class Solution {
    public String solution(String n_str) {
        String answer = "";
        
        for(int i=0; i<n_str.length(); i++){
            char chr = n_str.charAt(i);
            if(answer.length() == 0 && chr == '0'){
                continue;
            }else{
                answer+= chr;
            }
        }
        
        

        return answer;
    }
}
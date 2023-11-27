class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        
        for(int i=0; i<code.length(); i++){
            if(code.charAt(i)=='1'){
                mode++;
                continue;
            }
            else{
                if(i%2 == (mode%2)){
                    answer+=code.charAt(i);
                }
            }
        }
        
        if(answer.length() == 0){
            return "EMPTY";
        }
        
        return answer;
    }
}
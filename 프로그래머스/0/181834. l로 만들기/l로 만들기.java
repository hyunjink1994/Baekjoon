class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(int i=0; i<myString.length(); i++){
            char a = myString.charAt(i);
            if((int) a < 108){
                answer+='l';
            }else{
                answer+= myString.charAt(i);
            }
        }
        
        return answer;
    }
}
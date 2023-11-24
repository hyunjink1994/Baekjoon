class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        
        int aLength = my_string.length();
        int bLength = overwrite_string.length();
        
        
        for(int i=0; i<aLength; i++){
            if(i >= s && i< s+bLength){
                answer+= overwrite_string.charAt(i-s);
            }else{
                answer+= my_string.charAt(i);
            }
        }
        
        return answer;
        
    }
}
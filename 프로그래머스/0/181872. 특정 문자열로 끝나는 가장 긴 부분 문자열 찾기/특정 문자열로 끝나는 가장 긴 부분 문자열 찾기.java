class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        int myStringLength = myString.length();
        int patLength = pat.length();
        int end = 0;
        
        
        for(int i= myStringLength ; i >= 0; i--){
            String str = myString.substring(i-patLength,i);
            if(str.equals(pat)){
                end = i;
                break;
            }
        }
        
        return myString.substring(0, end);
    }
}
class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int myStringLength = myString.length();
        int patLength = pat.length();
        
        for(int i=0; i<myStringLength-patLength+1; i++){
            String str = myString.substring(i,i+patLength);
            if(str.equals(pat)){
                answer++;
            }
        }
        
        
        return answer;
    }
}
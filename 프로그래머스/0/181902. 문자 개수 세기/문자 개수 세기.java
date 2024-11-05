class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        // 65 ~ 90 : 대문자
        // 97 ~ 122 : 소문자
        for(int i=0; i<my_string.length(); i++){
            char ch = my_string.charAt(i);
            int asc = (int) ch;
            if(asc < 91){
                answer[asc-65]++;
            }else{
                answer[asc-71]++;
            }
        }
        
        
        
        
        return answer;
    }
}
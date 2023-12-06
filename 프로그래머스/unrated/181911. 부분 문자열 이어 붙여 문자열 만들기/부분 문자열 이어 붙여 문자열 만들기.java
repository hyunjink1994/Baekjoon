class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        int length = parts.length;
        for(int i=0; i<length;i++){
            answer += my_strings[i].substring(parts[i][0], parts[i][1]+1);
        }
        
        return answer;
    }
}
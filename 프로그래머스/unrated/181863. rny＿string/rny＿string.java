class Solution {
    public String solution(String rny_string) {
        String answer = "";
        int length = rny_string.length();
        for(int i=0;i<length;i++){
            if(rny_string.charAt(i)=='m'){
                answer+='r';
                answer+='n';
            }else{
                answer+=rny_string.charAt(i);
            }
        }
        return answer;
    }
}
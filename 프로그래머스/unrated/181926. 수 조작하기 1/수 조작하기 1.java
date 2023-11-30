class Solution {
    public int solution(int n, String control) {
        int answer = n;
        
        int lenControl = control.length();
        for(int i=0;i<lenControl;i++){
            if(control.charAt(i)=='w'){
                answer++;
            }
            else if(control.charAt(i) =='s'){
                answer--;
            }
            else if(control.charAt(i) == 'd'){
                answer+=10;
            }
            else if(control.charAt(i) == 'a'){
                answer-=10;
            }
            
        }
        
        return answer;
    }
}
class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = false;
        boolean x5 = false;
        boolean x6 = false;
        if(x1 || x2){
            x5 = true;
        }
        if(x3 || x4){
            x6 = true;
        }
        
        if(x5 && x6){
            answer = true;
        }
        
        return answer;
    }
}
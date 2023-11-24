import java.lang.Math;

class Solution {
    public int solution(int a, int b) {
        
        return Math.max((2*a*b) , plusCal(a,b));
    }
    
    public int plusCal(int a, int b){
        String aStr = Integer.toString(a);
        String bStr = Integer.toString(b);
        
        return Integer.parseInt(aStr+bStr);
    }
    
}
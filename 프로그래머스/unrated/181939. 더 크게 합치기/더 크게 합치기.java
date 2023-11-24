import java.lang.Math;

class Solution {
    public int solution(int a, int b) {
        
        return Math.max(plusCalculation(a,b),plusCalculation(b,a));
    }
    public int plusCalculation(int a, int b){
        String aStr = Integer.toString(a);
        String bStr = Integer.toString(b);

        aStr += bStr;

        return Integer.parseInt(aStr);
    }
}

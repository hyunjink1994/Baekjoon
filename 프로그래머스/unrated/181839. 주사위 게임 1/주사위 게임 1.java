import java.lang.Math;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        if(a%2 == 1 && b%2 == 1){
            return (int) (Math.pow(a,2)+ Math.pow(b,2));
        }
        else if (a%2 == 0 && b%2 ==0){
            return (int) (Math.abs(a-b));
        }
        else{
            return 2*(a+b);
        }
    }
}
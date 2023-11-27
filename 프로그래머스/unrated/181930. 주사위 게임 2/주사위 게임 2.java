import java.util.*;
import java.lang.Math;

class Solution {
    public int solution(int a, int b, int c) {
        Set<Integer> set = new HashSet<Integer>();
        int answer = 1;
        set.add(a);
        set.add(b);
        set.add(c);
        
        int size = set.size();
        
        if(size < 4){
            int tmp = 0;
            tmp +=a;
            tmp +=b;
            tmp +=c;
            answer*=tmp;
        }
        if(size < 3){
            int tmp = 0;
            tmp += (int) Math.pow((double) a, 2.0d);
            tmp += (int) Math.pow((double) b, 2.0d);
            tmp += (int) Math.pow((double) c, 2.0d);
            answer*=tmp;
        }
        if(size < 2){
            int tmp = 0;
            tmp += (int) Math.pow((double) a, 3.0d);
            tmp += (int) Math.pow((double) b, 3.0d);
            tmp += (int) Math.pow((double) c, 3.0d);
            answer*=tmp;
        }
        
        
        return answer;
    }
}
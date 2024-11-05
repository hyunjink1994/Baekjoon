import java.util.*;
import java.lang.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        
        StringBuilder sb = new StringBuilder();
        
        String str = my_string.substring(s,e+1);
        // System.out.println(str);
        StringBuffer sbf = new StringBuffer(str).reverse();
        // System.out.println(sbf.toString());
        
        String front_str = my_string.substring(0,s);
        String end_str = my_string.substring(e+1, my_string.length());
        // System.out.printf("%s %s %s", front_str, sbf, end_str);
        
        sb.append(front_str);
        sb.append(sbf);
        sb.append(end_str);
        
        return sb.toString();
    }
}
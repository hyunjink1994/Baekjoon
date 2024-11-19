import java.util.*;
import java.lang.*;
import java.math.*;
import java.time.*;

class Solution {
    public int solution(int[] date1, int[] date2) {
        
        LocalDate ld1 = LocalDate.of(date1[0],date1[1],date1[2]);
        LocalDate ld2 = LocalDate.of(date2[0],date2[1],date2[2]);
        
        Period period = Period.between(ld1, ld2);
        
        if(period.getDays() > 0){
            return 1;
        }else{
            return 0;
        }
        
    }
}
import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        
        int row_min = Integer.MAX_VALUE;
        int row_max = -1;
        int col_min = Integer.MAX_VALUE;
        int col_max = -1;
        
        for(int i=0; i<wallpaper.length; i++){
            for(int j=0; j<wallpaper[0].length(); j++){
                char k = wallpaper[i].charAt(j);
                
                if(k == '#'){
                    if( i < row_min){
                        row_min = i;
                    }
                    
                    if( i > row_max){
                        row_max = i;
                    }
                    
                    if( j < col_min){
                        col_min = j;
                    }
                    if( j > col_max){
                        col_max = j;
                    }
                }
            }
        }
        
        // row_max, col_max에 1을 더해 직사각형을 포함하도록 수정
        int[] answer = {row_min, col_min, row_max + 1, col_max + 1};
        
        return answer;
    }
}

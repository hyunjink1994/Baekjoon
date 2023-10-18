import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
 
public class Solution {
 
    protected static boolean constraint(int row, int[] height){
        boolean rowLength = false;
        boolean heightPresent = false;
        boolean heightZero = false;
 
        if( row <= 1000){
            rowLength = true;
 
            heightPresent = Arrays.stream(height)
                .filter(n -> n >255)
                .findFirst()
                .isPresent();
 
            int [] heightArr = {0, 1, height.length-1 , height.length-2};
 
            heightZero = Arrays.stream(heightArr)
                .filter(n-> height[n] != 0)
                .findFirst()
                .isPresent();
        }
        return rowLength & !heightPresent & !heightZero;
    }
 
 
 
 
    public static void main(String[] args) throws IOException {
 
        Long start = System.currentTimeMillis();
 
        // System.setIn(new FileInputStream("SWEA/src/{input.txt}"));
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 
        for(int test = 1; test <= 10 ; test++){
            int row  = Integer.parseInt(in.readLine());
            int[] height = Stream.of(in.readLine().split(" "))
                // .mapToInt(n -> Integer.parseInt(n))
                .mapToInt(Integer::parseInt)
                .toArray();
 
            if(constraint(row,height)){
                System.out.printf("#%d %d\n",test , solve(row,height));
            }
        }
        long end = System.currentTimeMillis();
    }
 
 
    protected static int solve(int row , int[] height){
        int answer = 0;
 
        int[] arrRange = {-2,-1,0,1,2};
        for(int i = 2 ; i < row-2 ; i++){
            List<Integer> arr = new ArrayList<>();
            for (int j =0; j< arrRange.length ; j++){
                arr.add(height[i+arrRange[j]]);
            }
 
            int max = Collections.max(arr);
            if(max == arr.get(2)){
                arr.remove(2);
                answer += max - Collections.max(arr);
            }
        }
        return answer;
    }
}
import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;
 
class Solution
{
    // 제약조건
    private static boolean constraint(int row, int[] height, int dumpCount) {
        boolean answer = false;
        boolean heightPresent = false;
        if (row == 100 && dumpCount >= 1 && dumpCount <= 1000) {
            answer = true;
            heightPresent = Arrays.stream(height)
                    .filter(n -> n > 100)
                    .filter(n -> n< 1)
                    .findFirst()
                    .isPresent();
        }
        return !heightPresent & answer;
    }
 
    public static void main(String[] args) throws IOException {
 
        long start = System.currentTimeMillis();
 
//        System.setIn(new FileInputStream("SWEA/src/input.txt"));
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 
        for(int test=1;test <=10;test++){
            int dumpCount = Integer.parseInt(in.readLine());
            int[] heights = Stream.of(in.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
 
            int row = heights.length;
 
            if(constraint(row,heights,dumpCount)){
                System.out.printf("#%d %d\n", test, solve(dumpCount,heights));
            }
        }
 
        long end = System.currentTimeMillis();
//        System.out.println("수행시간 : " + (end - start) + " ms");
    }
 
 
 
    private static int solve(int dumpCount, int[] heights){
        int[] countArr = countArray(heights);
 
        for(int i = 1; i <= dumpCount; i++){
            moveDump(countArr);
        }
        int answer = findMaxHeight(countArr) - findMinHeight(countArr);
        return answer;
    }
 
    private static int[] countArray(int[] heights){
        int[] countArray = new int[101];
 
        Arrays.stream(heights)
                .forEach(n -> countArray[n]++);
 
        return countArray;
    }
 
    private static int[] moveDump(int[] countArr){
        int maxIndex = findMaxHeight(countArr);
        int minIndex = findMinHeight(countArr);
 
        countArr[maxIndex]--;
        countArr[maxIndex-1]++;
        countArr[minIndex]--;
        countArr[minIndex+1]++;
 
        return countArr;
    }
 
    private static int findMaxHeight(int[] countArr){
        int answer = 0;
 
        for(int i =100; i >=1 ;i--){
            if(countArr[i] != 0){
                answer = i;
                break;
            }
        }
        return answer;
    }
 
    private static int findMinHeight(int[] countArr){
        int answer = Integer.MAX_VALUE;
 
        for(int i =1; i<=100 ; i++){
            if(countArr[i] !=0){
                answer = i;
                break;
            }
        }
        return answer;
    }
}
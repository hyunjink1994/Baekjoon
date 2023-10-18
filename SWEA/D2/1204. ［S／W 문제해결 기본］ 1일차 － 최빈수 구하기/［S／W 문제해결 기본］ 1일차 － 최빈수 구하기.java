import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;
 
public class Solution {
 
    public static void printMemoryUsage(){
        Runtime runtime = Runtime.getRuntime();
        System.out.println("메모리 사용량 : " +runtime.totalMemory()/ 1024 / 1024 + "MB");
    }
    protected static boolean constraint(int[] scores){
        boolean studentLength = false;
        boolean scoreScope = false;
 
        if(scores.length == 1000){
            studentLength = true;
 
            scoreScope = Arrays.stream(scores)
                .filter(n -> n >0)
                .filter(n -> n >100)
                .findFirst()
                .isPresent();
        }
 
        return studentLength & !scoreScope;
    }
 
    public static void main(String[] args) throws Exception{
 
        long start = System.currentTimeMillis();
 
        //System.setIn(new FileInputStream("SWEA/src/input.txt"));
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 
        int testCase = Integer.parseInt(in.readLine());
 
        for (int test = 1; test <= testCase; test ++){
            int caseNumber = Integer.parseInt(in.readLine());
 
            int[] scores = Stream.of(in.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
            if(constraint(scores)){
                int[] answerCount = new int[101];
 
                Arrays.stream(scores)
                    .forEach(n -> answerCount[n]++);
 
                int maxValue = Arrays.stream(answerCount).max().getAsInt();
                int answer=0;
                for(int i = 100;i>=0 ;i--){
                    if(answerCount[i] == maxValue){
                        answer = i;
                        break;
                    }
                }
                System.out.printf("#%d %d\n",test, answer);
            }
        }
        // long end = System.currentTimeMillis();
        // printMemoryUsage();
        // System.out.println("경과 시간 : "+ (end-start) +"ms");
    }
}
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void printMemoryUsage(){
        Runtime runtime = Runtime.getRuntime();

        System.out.println("Memory Usage : "
        + (runtime.totalMemory() - runtime.freeMemory())/1024/1024
        + " mb");
    }


    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();

//        System.setIn(new FileInputStream("SWEA/src/input.txt"));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int T = 10;

        for (int tc = 0; tc < T ; tc++) {
            String testCase = bufferedReader.readLine();
            String check = bufferedReader.readLine();
            String arr = bufferedReader.readLine();

            int answer = 0;

            for (int i = 0; i < arr.length() - check.length()+1; i++) {
                if(arr.substring(i,i+check.length()).equals(check)){
                    answer ++;
                }
            }


            System.out.printf("#%s %d\n", testCase, answer);
        }

        long endTime = System.currentTimeMillis();
//        System.out.println("Time : " + (endTime - startTime) + " ms");
//        printMemoryUsage();


    }
}

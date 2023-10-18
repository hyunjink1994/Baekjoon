import java.io.*;
import java.lang.management.MemoryUsage;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution {

    public static void printMemotyUsage(){
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Usage Memory : " +(runtime.totalMemory() - runtime.freeMemory())/1024/1024 + " mb");
    }

    public static boolean constraint(ArrayList<ArrayList<Integer>> arr){
        boolean answer = false;

        if(arr.size() == 100 && arr.get(0).size() == 100){
            answer = true;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
//        System.setIn(new FileInputStream("SWEA/src/input.txt"));

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer;

        int T = 10;

        for(int tc = 1; tc<= T; tc++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int caseNumber = Integer.parseInt(stringTokenizer.nextToken());

            ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

            for (int i = 0; i < 100; i++) {
                ArrayList<Integer> row = new ArrayList<>();
                stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                for (int j = 0; j < 100; j++) {
                    row.add(Integer.parseInt(stringTokenizer.nextToken()));
                }
                arr.add(row);
            }

            System.out.printf("#%d %d\n", tc, answer(arr));
        }

        long endTime = System.currentTimeMillis();
//        System.out.printf("time : " + (endTime - startTime) + " ms\n");
//        printMemotyUsage();
    }

    public static int answer(ArrayList<ArrayList<Integer>> arr){
        int left = 0;
        int right = 0;
        ArrayList<Integer> sumArr = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            left+=arr.get(i).get(i);
            right+=arr.get(i).get(99-i);
            int row = 0;
            int col = 0;
            for (int j = 0; j < arr.size() ; j++) {
                row += arr.get(i).get(j);
                col += arr.get(j).get(i);
            }
            sumArr.add(row);
            sumArr.add(col);
        }
        int max = 0;
        for (int i = 0; i < sumArr.size(); i++) {
            if(max < sumArr.get(i)){
                max = sumArr.get(i);
            }
        }

        if(max < left){
            max = left;
        } else if (max < right) {
            max = right;
        }

        return max;
    }

}

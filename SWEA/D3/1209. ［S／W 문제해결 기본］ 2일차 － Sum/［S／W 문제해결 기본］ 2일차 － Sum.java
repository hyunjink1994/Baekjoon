import java.util.*;
import java.io.*;
import java.lang.Math;
import java.text.DecimalFormat;

public class Solution{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // input
        for(int cn = 0; cn < 10; cn++){
            st = new StringTokenizer(br.readLine());
            int case_num = Integer.parseInt(st.nextToken());
            int[][] arr = new int[100][100];
            for(int i=0; i<100; i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0;j<100;j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            System.out.printf("#%d %d\n", case_num, SolutionAnswer(arr));
        }
    }

    public static int SolutionAnswer(int[][] arr){

        int answer = 0;

        for(int i=0; i<100; i++){
            int sumX = 0;
            int sumY = 0;
            for(int j=0;j<100;j++){
                sumX += arr[i][j];
                sumY += arr[j][i];
            }
            if(answer <= sumX || answer < sumY){
                if(sumX < sumY){
                    answer = sumY;
                }else{
                    answer = sumX;
                }
            }
        }
        int sumA =0;
        int sumB =0;
        for(int i=0;i<100;i++){
            sumA+=arr[99-i][i];
            sumB+=arr[i][i];
        }
        if(answer <= sumA || answer < sumB){
            if(sumA < sumB){
                answer = sumB;
            }else{
                answer = sumA;
            }
        }

        return answer;
    }
}
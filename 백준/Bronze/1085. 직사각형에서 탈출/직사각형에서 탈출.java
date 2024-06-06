import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[4];

        for(int i=0; i < 4; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer = Integer.MAX_VALUE;
        int row_min, col_min;
        if(arr[0] < arr[2] - arr[0]){
            row_min = arr[0];
        }else {
            row_min = arr[2]-arr[0];
        }
        if(arr[1] < arr[3]-arr[1]){
            col_min = arr[1];
        }else{
            col_min = arr[3]-arr[1];
        }

        if(row_min > col_min){
            answer = col_min;
        }else{
            answer = row_min;
        }

        System.out.println(answer);


    }
}
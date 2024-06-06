import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int[] row_arr = new int[3];
        int[] col_arr = new int[3];

        int[] count_row = new int[1001];
        int[] count_col = new int[1001];
        for(int i=0; i<3; i++){
            st= new StringTokenizer(br.readLine());
            row_arr[i] = Integer.parseInt(st.nextToken());
            count_row[row_arr[i]] +=1;
            col_arr[i] = Integer.parseInt(st.nextToken());
            count_col[col_arr[i]] +=1;
        }

        int answer_row = 0, answer_col = 0;
        for(int i=0; i < 3; i++){
            if(count_row[row_arr[i]] == 1){
                answer_row = row_arr[i];
            }
            if(count_col[col_arr[i]] == 1){
                answer_col = col_arr[i];
            }
        }

        sb.append(Integer.toString(answer_row)).append(' ').append(Integer.toString(answer_col));

        System.out.println(sb);

    }
}
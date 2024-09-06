import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int card_cnt = Integer.parseInt(st.nextToken());
        int black_jack  = Integer.parseInt(st.nextToken());

        int[] arr = new int[card_cnt];

        st = new StringTokenizer(br.readLine());
        for(int i =0; i<card_cnt; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;

        for(int i=0; i<card_cnt;i++){
            int tmp = 0;
            for(int j=i+1; j<card_cnt; j++){
                for(int k = j+1; k<card_cnt ; k++){
                    tmp = arr[i] + arr[j] + arr[k];
                    if(tmp <= black_jack && tmp > answer){
                        answer = tmp;
                    }
                }
            }
        }


        System.out.printf("%d" , answer);

    }
}
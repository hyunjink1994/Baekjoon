import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{

    static StringBuilder sb = new StringBuilder();

    static int Solution(int a, int b){
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        int answer;
        int tmp;

        while(true){
            tmp = max%min;
            if(tmp == 0){
                answer = min;
                break;
            }
            max = min;
            min = tmp;
        }
        return answer;
    }



    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[] arr = new int[4];

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<4; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if( i == 1){
                st = new StringTokenizer(br.readLine());
            }
        }

        int a = (arr[0] * arr[3]) + (arr[1] * arr[2]);
        int b = arr[1] * arr[3];

        int c = Solution(a,b);

        sb.append(a/c).append(" ").append(b/c);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
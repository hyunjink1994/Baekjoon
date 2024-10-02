import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{

    static StringBuilder sb =new StringBuilder();

    public static void Solution(int a, int b){

        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int answer = 1;
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

        sb.append(a*b/answer).append("\n");

        return;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int case_num = Integer.parseInt(st.nextToken());


        for(int i=0; i< case_num;i++){

            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken()) ;
            int b = Integer.parseInt(st.nextToken());

            Solution(a,b);
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
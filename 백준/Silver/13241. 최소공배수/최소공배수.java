import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{

    static StringBuilder sb =new StringBuilder();

    public static void Solution(long a, long b){

        long max = Math.max(a, b);
        long min = Math.min(a, b);
        long answer = 1;
        long tmp;
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

//        int case_num = Integer.parseInt(st.nextToken());


//        for(int i=0; i< case_num;i++){

//            st = new StringTokenizer(br.readLine());

            long a = Long.parseLong(st.nextToken()) ;
            long b = Long.parseLong(st.nextToken());

            Solution(a,b);
//        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        for(int i = start; i<= end; i++){
            int sqrt = (int) Math.sqrt(i) +1;
            int tmp = 0;
            
            if(i<2){
                continue;
            }

            if(i==2){
                sb.append(i).append("\n");
                continue;
            }

            for(int j=2; j<sqrt; j++){
                if(i%j == 0){
                    tmp =1;
                    break;
                }
            }
            if(tmp == 0){
                sb.append(i).append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();



    }
}
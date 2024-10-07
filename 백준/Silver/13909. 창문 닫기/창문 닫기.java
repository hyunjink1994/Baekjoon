import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int n = Integer.parseInt(st.nextToken());

//        int[] arr = new int[n+1];
//        arr[0] = 1;
//
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                if(j%i == 0){
//                    arr[j]++;
//                }
//            }
//        }
//
//        int answer = 0;
//        for(int i = 1; i<=n ; i++){
//            if(arr[i]%2 == 1){
//                answer++;
//            }
//        }

        int answer = (int)Math.sqrt(n);


        sb.append(answer);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
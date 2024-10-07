import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            if(a != 0){
                stack.push(a);
            }else{
                stack.pop();
            }
        }

        int answer = 0;
        while(!stack.empty()){
            answer += stack.peek();
            stack.pop();
        }

        sb.append(answer);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
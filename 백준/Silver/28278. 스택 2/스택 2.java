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
            switch (a){
                case 1 :
                    int b = Integer.parseInt(st.nextToken());
                    stack.push(b);
                    break;
                case 2 :
                    if(stack.empty()){
                        sb.append("-1\n");
                    }else{
                        sb.append(stack.peek()).append("\n");
                        stack.pop();
                    }
                    break;
                case 3 :
                    sb.append(stack.size()).append("\n");
                    break;
                case 4 :
                    if(stack.empty()){
                        sb.append("1").append("\n");
                    }else{
                        sb.append("0").append("\n");
                    }
                    break;
                case 5 :
                    if(stack.empty()){
                        sb.append("-1").append("\n");
                    }else{
                        sb.append(stack.peek()).append("\n");
                    }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
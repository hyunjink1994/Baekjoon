import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static boolean Solution() throws IOException{
        Stack<String> stack = new Stack<>();
        st = new StringTokenizer(br.readLine());
        String read = st.nextToken();
        int length = read.length();

        for(int i=0; i< length; i++){
            char at = read.charAt(i);
            if(at == '('){
                stack.push("(");
            }else if (at == ')'){
                if(stack.empty()){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }

        return stack.empty();
    }

    public static void main(String[] args) throws IOException{

        st = new StringTokenizer(br.readLine());
        int test_case = Integer.parseInt(st.nextToken());

        for(int i = 0; i< test_case; i++){
            if(Solution()){
                sb.append("YES\n");
            }else{
                sb.append("NO\n");
            }
        }

        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }
}
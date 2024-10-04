import java.util.*;
import java.io.*;

public class Main{
    static StringBuilder sb = new StringBuilder();

    static void Solution(int n){
        int start = n + 1;
        int end = 2 * n;
        int answer = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                answer++;
            }
        }
        sb.append(answer).append("\n");
    }

    static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        int sqrt = (int) Math.sqrt(num);
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            if (n == 0) {
                break;
            } else {
                Solution(n);
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}

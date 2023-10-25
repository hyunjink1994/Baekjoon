import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int answer = 0;

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int input = Integer.parseInt(st.nextToken());

        while(input/10 != 0 || input %10 != 0){
            answer+=input%10;
            input/=10;
        }

        bw.write(String.valueOf(answer+"\n"));
        bw.close();

    }
}

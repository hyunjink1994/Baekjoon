import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;


        int[] chessReq = {1,1,2,2,2,8};

        int[] answer = new int[6];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.printf("%d ", chessReq[i]-answer[i]);
        }
    }
}

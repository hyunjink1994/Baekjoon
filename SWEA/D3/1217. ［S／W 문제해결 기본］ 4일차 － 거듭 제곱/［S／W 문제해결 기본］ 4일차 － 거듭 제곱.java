import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            String tc = st.nextToken();

            st = new StringTokenizer(br.readLine());
            int a = 1;
            int b = 1;
            while (st.hasMoreTokens()){
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());
            }

            int answer = 1;

            for (int j = 0; j < b; j++) {
                answer*= a;
            }

            System.out.printf("#%s %d\n" , tc, answer);

        }
    }
}

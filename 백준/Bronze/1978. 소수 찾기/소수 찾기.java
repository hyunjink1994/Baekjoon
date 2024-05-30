import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int case_num = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int answer = 0;
        for(int i =0 ; i<case_num; i++){
            int k = Integer.parseInt(st.nextToken());

            for(int j = 2 ; j<=k ;j++ ){
                if(j==k){
                    answer+=1;
                    break;
                }
                if(k%j == 0){
                    break;
                }
            }
        }

        System.out.println(answer);

    }
}
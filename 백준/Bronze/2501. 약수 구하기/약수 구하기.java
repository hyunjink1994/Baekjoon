import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int goal = Integer.parseInt(st.nextToken());

        int count = 0;
        int answer = 0;
        for(int i =1; i<num+1;i++){
            if(num%i == 0){
                count++;
                if(count == goal){
                    answer = i;
                    break;
                }
            }
        }

        System.out.println(answer);

    }
}
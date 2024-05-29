import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String input = st.nextToken();
        int formation = Integer.parseInt(st.nextToken());
        int answer =0;


        for(int i =0; i <input.length();i++){
            int k = input.length()-i-1;

            int loc = (int) input.charAt(k);

            if(loc >=48 && loc <=57){
                loc -=48;
            }
            if(loc >=65 && loc <=90){
                loc-=55;
            }

            int l = 1;
            for(int j=0; j<i;j++){
                l*=formation;
            }
            answer += loc*l;

        }



        System.out.println(answer);
    }
}

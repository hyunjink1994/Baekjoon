import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int input = Integer.parseInt(st.nextToken());
        int formation = Integer.parseInt(st.nextToken());

        String answer ="";

        while(input/formation !=0 || input%formation !=0){

            int k = input%formation;
            String l;
            if(k>=10 && k<=35){
                l = Character.toString((char) (k+55));
            }else{
                l = Integer.toString(k);
            }
            answer = l+answer;
            input/=formation;
        }

        System.out.println(answer);
    }
}
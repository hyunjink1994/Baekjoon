import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int input = Integer.parseInt(st.nextToken());

        int index = 1;
        int k = 1;
        while (input > k){
            index+=1;
            k+=index;
        }

        if(index%2 == 0) {
            System.out.println((input - k + index) + "/" + (k + 1 - input));
        }else{
            System.out.println((k + 1 - input) + "/" + (input - k + index));
        }
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//class name : Main
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int index = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 9; i++) {
            int x = Integer.parseInt(br.readLine());
            if(x > max){
                index = i+1;
                max = x;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}

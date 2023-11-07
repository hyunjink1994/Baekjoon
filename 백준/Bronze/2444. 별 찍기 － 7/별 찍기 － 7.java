import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());

        for (int i = 1; i < 2*x; i++) {
            for (int j = 0; j < Math.abs(x-i) ; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < (2*x) - 2*(Math.abs(x-i)) -1 ; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}

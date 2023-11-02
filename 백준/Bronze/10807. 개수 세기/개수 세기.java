import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// class name : Main
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int length = Integer.parseInt(br.readLine());

        int[] arr = new int[length];
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int x = Integer.parseInt(br.readLine());

        System.out.printf("%d\n", solve(arr,x));


    }

    private static int solve(int[] arr, int x) {

        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                answer ++;
            }
        }

        return answer;
    }
}

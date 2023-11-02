import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// class name : Main
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;


        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solve(arr,x));
    }

    private static String solve(int[] arr, int x) {
        String answer = "";

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < x){
                answer += String.valueOf(arr[i])+" ";
            }
        }

        return answer;
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = new String[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = br.readLine();
        }

        int[] arrInt = new int[5];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            arrInt[i] = arr[i].length();
            if(max < arr[i].length()){
                max = arr[i].length();
            }
        }

        StringBuffer sb = new StringBuffer();

        for (int j = 0; j < max; j++) {
            for (int i = 0; i < 5; i++) {
                if(j >= arr[i].length()){
                    continue;
                }
                sb.append(arr[i].charAt(j));
            }
        }

        System.out.println(sb);
    }
}

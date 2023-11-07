import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int count = Integer.parseInt(br.readLine());


        int answer = 0;

        for (int i = 0; i < count; i++) {

            int[] arr = new int[26];

            String str = br.readLine();
            char tmp = ' ';

            for (int j = 0; j < str.length(); j++) {
                char chr = str.charAt(j);
                if(chr == tmp){
                    continue;
                }else {
                    int charInt = ((int) chr) - 97 ;
                    arr[charInt]++;
                    tmp = chr;
                }
            }

            int max = 0;
            for (int j = 0; j < arr.length; j++) {
                if(max < arr[j]){
                    max = arr[j];
                }
            }

            if(max <2){
                answer++;
            }

        }

        System.out.println(answer);
    }
}

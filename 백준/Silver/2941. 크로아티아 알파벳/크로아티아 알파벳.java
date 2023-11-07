import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        int answer = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i+arr[j].length() > str.length()){
                    continue;
                }
                String subStr = str.substring(i,i+arr[j].length());
                if(subStr.equals(arr[j])){
                    answer++;
                }
            }
        }

        System.out.println(str.length()-answer);

    }
}

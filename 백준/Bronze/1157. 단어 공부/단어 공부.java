import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char cr = str.charAt(i);
            int crInt = (int) cr;
            if(crInt >96){
                crInt-=97;
            }else{
                crInt-=65;
            }
            arr[crInt]++;
        }
        
        int maxChar = Arrays.stream(arr).max().getAsInt();
        int maxCount = 0;
        int maxNum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == maxChar){
                maxCount++;
                maxNum = i;
            }
        }

        if(maxCount > 1){
            System.out.println("?");
        }
        else {
            System.out.println((char) (maxNum+65));
        }
        
        
    }
}

import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int length = Integer.parseInt(st.nextToken());

        int[] arr = new int[length];

        for(int i = 0; i < length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0;i<arr.length;i++){
            int min = Integer.MAX_VALUE;
            int min_loc = Integer.MAX_VALUE;
            for(int j=i;j<arr.length;j++){
                if(min > arr[j]){
                    min = arr[j];
                    min_loc = j;
                }
            }
            int tmp = arr[i];
            arr[i] = min;
            arr[min_loc] = tmp;
        }

        for(int i=0; i<arr.length;i++){
            System.out.printf("%d\n", arr[i]);
        }
    }
}
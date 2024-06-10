import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        for(int i=0;i<3;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;

        if(arr[0] > arr[1]){
            if(arr[1] > arr[2]) max= arr[0];
            else max = Math.max(arr[0], arr[2]);
        }
        else max = Math.max(arr[1], arr[2]);;

        if(arr[0]+arr[1]+arr[2]-max > max) System.out.println(arr[0]+arr[1]+arr[2]);
        else System.out.println((arr[0]+arr[1]+arr[2]-max)*2-1);

    }
}
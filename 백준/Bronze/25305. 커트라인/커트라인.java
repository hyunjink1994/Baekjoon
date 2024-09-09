import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int length = Integer.parseInt(st.nextToken());
        int rank = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[length];

        for(int i = 0; i < length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
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

        System.out.printf("%d" , arr[length-rank]);




//        int sum = 0;
//        int avg = 0;
//        for(int i=0;i<arr.length;i++){
//            sum += arr[i];
//            avg += arr[i]/5;
//        }
//
//        System.out.printf("%d\n" , avg);
//        System.out.printf("%d" , arr[2]);

    }
}
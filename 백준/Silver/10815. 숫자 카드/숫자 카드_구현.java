import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int[] arr_check = new int[M];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<M; i++){
            arr_check[i] = Integer.parseInt(st.nextToken());
        }

        SetSolution(N,M, arr, arr_check);
//        Solution(N, M, arr, arr_check);

    }
    public static void SetSolution(int n, int m, int[] arr, int[] arr_check){
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<n ; i++){
            set.add(arr[i]);
        }

        for(int i=0; i<m ; i++){
            if(set.contains(arr_check[i])){
                System.out.printf("%d ", 1);
            }else{
                System.out.printf("%d ", 0);
            }
        }





    }

    public static void Solution(int n, int m, int[] arr, int[] arr_check){
        for(int i =0; i<m; i++){
            for(int j=0;j<n; j++){
                if(arr[j] == arr_check[i]){
                    System.out.printf("%d ",1);
                    break;
                }else if(j== (n-1) && arr[j] != arr_check[i]){
                    System.out.printf("%d ", 0);
                }
            }
        }
    }

}
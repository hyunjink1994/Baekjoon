import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        String[][] arr = new String[N][3];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = String.valueOf(i);
            arr[i][1] = String.valueOf(st.nextToken());
            arr[i][2] = st.nextToken();
        }

        Arrays.sort(arr, (e1,e2) -> {
            if(Integer.parseInt(e1[1]) != Integer.parseInt(e2[1])){
                return (Integer.parseInt(e1[1]) - Integer.parseInt(e2[1]));
            }else{
                return (Integer.parseInt(e1[0]) - Integer.parseInt(e2[0]));
            }
        });


        for(String[] ele : arr){
            System.out.printf("%s %s\n" , ele[1] , ele[2]);
        }
        br.close();

    }
}
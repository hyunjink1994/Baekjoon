import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

//        System.out.printf("%d, %d",n,m);

        char[][] arr = new char[n][m];

        for(int i=0; i<n; i++){
//            br = new BufferedReader(new InputStreamReader(System.in));
            String a = "";
            a = br.readLine();
//            System.out.printf("%s\n", a);
            for(int j=0; j<m; j++){
                arr[i][j] = a.charAt(j);
            }

        }

        int answer = Integer.MAX_VALUE;
        for(int i=0; i< n-7;i++){
            for(int j=0; j< m-7; j++){
                if(answer > Solution(arr,i,j)){
                    answer = Solution(arr,i,j);
                }
            }
        }


//        System.out.printf("%d , %d",answer_W, answer_B);
        System.out.printf("%d" , answer);
    }


    public static int Solution(char[][] arr, int start_x, int start_y){
        int answer = 0;

        int end_x = start_x+8;
        int end_y = start_y+8;

        int answer_W = 0;
        int answer_B = 0;

        for(int i=start_x; i<end_x; i++){
            for(int j=start_y; j<end_y;j++){
                if((i+j)%2 == 0 && arr[i][j] =='B'){
                    answer_W++;
                }else if((i+j)%2 ==1 && arr[i][j] == 'B'){
                    answer_B++;
                }else if((i+j)%2 == 0 && arr[i][j] =='W'){
                    answer_B++;
                }else if((i+j)%2 == 1 && arr[i][j] == 'W'){
                    answer_W++;
                }
            }
        }

        if(answer_W > answer_B){
            answer = answer_B;
        }else{
            answer = answer_W;
        }
        return answer;
    }
}
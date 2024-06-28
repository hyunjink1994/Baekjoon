import java.util.*;
import java.io.*;
import java.lang.Math;
import java.text.DecimalFormat;


public class Solution{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int cn = 0; cn<10;cn++){
            st = new StringTokenizer(br.readLine());
            int case_num = Integer.parseInt(st.nextToken());
            int[][] arr = new int[100][100];

            for(int i=0; i<100;i++ ){
                st = new StringTokenizer(br.readLine());
                for(int j=0;j<100;j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            System.out.printf("#%d %d\n", case_num, SolutionAnswer(arr));
        }
    }

    public static int SolutionAnswer(int[][] arr){
        int answer = 0;

        int startX = 99;
        int startY =0;

        int[][] arr_emp = new int[100][100];

        for(int i=0; i<100; i++){
            if(arr[99][i] == 2){
                startY = i;
                break;
            }
        }


//        System.out.printf("start X = %d , Y = %d \n",startX,startY);

        int[] hor = {-1,1};

        while(startX != 0){
            arr_emp[startX][startY] = 1;
            int leftY = startY -1;
            int rightY = startY +1;
            int upX = startX -1;
//            System.out.printf("X : %d , Y : %d\n", startX, startY);

            boolean canLeft = (leftY >= 0 && arr[startX][leftY] == 1 && arr_emp[startX][leftY] ==0);
            boolean canRight =(rightY < 100 && arr[startX][rightY] == 1 && arr_emp[startX][rightY] == 0);
            boolean canUp = (upX >= 0 && arr[upX][startY] == 1 && arr_emp[upX][startY] == 0);

//            System.out.printf("canLeft : %b , canRight : %b , canUp : %b\n",canLeft, canRight, canUp);

            if(canLeft){
                startY-=1;
                continue;
            }else if(canRight){
                startY+=1;
                continue;
            }else if(canUp){
                startX-=1;
                continue;
            }else{
                //System.out.println("errorrr!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                break;
            }


        }

        answer = startY;
        return answer;
    }


}
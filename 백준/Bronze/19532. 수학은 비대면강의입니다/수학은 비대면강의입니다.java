import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        int x = -999;
        int y = -999;

        int answer_x = 0;
        int answer_y = 0;

        for(int i = x; i<1000 ; i++){

            for(int j=y; j<1000 ; j++){
                if(((a*i) + (b*j)) == c && ((d*i)) + (e*j) == f){
                    answer_x = i;
                    answer_y = j;
                    break;
                }
            }
        }



        System.out.printf("%d %d",answer_x,answer_y);


    }
}
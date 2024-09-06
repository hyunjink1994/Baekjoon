import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int answer = 0;
        int unit = 0;
        int input = Integer.parseInt(st.nextToken());
        int input_tmp = input;

        while(input != 0){
            unit ++;
            input/=10;
        }

//        System.out.printf("%d \n" , unit);
//        System.out.printf("%d \n" , input_tmp);
        for(int i = input_tmp - (9*unit); i<input_tmp ; i++){

//            System.out.printf("%d \n" , sum_Unit(i));

            if(i+sum_Unit(i) == input_tmp){
                answer = i;
                break;
            }
        }

        System.out.printf("%d" , answer);

    }


    public static int sum_Unit(int a){
        int answer = 0;

        while(a  != 0 ){
            answer += a%10;
            a/=10;
        }
        return answer;
    }
}
import java.util.*;
import java.io.*;

public class Main{
    static int num;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        num = Integer.parseInt(st.nextToken());
        System.out.printf("%d" , factorial(num));
    }

    public static int factorial(int num){
        if(num == 0){
            return 1;
        }
        return factorial(num-1)*num;
    }
}
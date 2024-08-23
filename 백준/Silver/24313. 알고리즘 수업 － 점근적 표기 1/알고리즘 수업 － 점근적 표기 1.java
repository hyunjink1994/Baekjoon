import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long c = Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());

        if(c>=a && c>=0 && (c-a)*n >= b){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
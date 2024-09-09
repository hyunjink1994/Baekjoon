import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int answer =0;

        int suger = Integer.parseInt(st.nextToken());

        if (suger == 4 || suger == 7) {
            System.out.println(-1);
        }
        else if (suger % 5 == 0) {
            System.out.println(suger / 5);
        }
        else if (suger % 5 == 1 || suger % 5 == 3) {
            System.out.println((suger / 5) + 1);
        }
        else if (suger % 5 == 2 || suger % 5 == 4) {
            System.out.println((suger / 5) + 2);


        }
    }
}
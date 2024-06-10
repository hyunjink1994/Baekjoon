import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int MIN_INT_ROW = Integer.MAX_VALUE;
        int MAX_INT_ROW = Integer.MIN_VALUE;
        int MIN_INT_COL = Integer.MAX_VALUE;
        int MAX_INT_COL = Integer.MIN_VALUE;

        st = new StringTokenizer(br.readLine());
        int answer = 0;

        int input = Integer.parseInt(st.nextToken());


        for(int i=0;i<input;i++){
            st = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());
            if(MIN_INT_ROW > row) MIN_INT_ROW = row;
            if(MAX_INT_ROW < row) MAX_INT_ROW = row;
            if(MIN_INT_COL > col) MIN_INT_COL = col;
            if(MAX_INT_COL < col) MAX_INT_COL = col;
        }
        System.out.printf("%d\n", (MAX_INT_ROW - MIN_INT_ROW) * (MAX_INT_COL - MIN_INT_COL) );
    }
}
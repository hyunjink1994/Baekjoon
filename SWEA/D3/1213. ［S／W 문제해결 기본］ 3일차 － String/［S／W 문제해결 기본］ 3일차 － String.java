import java.util.*;
import java.io.*;


public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int tc = 0; tc<10 ;tc++){
            st = new StringTokenizer(br.readLine());
            int case_number = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            String find_str = st.nextToken();
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            System.out.printf("#%d %d\n", case_number , SolutionAnswer(str, find_str));
        }
    }

    public static int SolutionAnswer(String str, String find_str){
        int answer = 0;
        int str_length = str.length();
        int find_str_length = find_str.length();
//        System.out.printf("str_length : %d , find_str_length : %d",str.length(), find_str.length());

        for(int i=0; i < str_length-find_str_length+1; i++){
            boolean equal = (str.substring(i,i+find_str_length).equals(find_str));
            if(equal){
                answer++;
            }
        }
        return answer;
    }
}

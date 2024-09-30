import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());


        HashSet<String> set = new HashSet<>();

        String str = st.nextToken();
        int len = str.length();

//        int n = ((len+1) * (len)) / 2;

//        System.out.println(n);

        for(int i=0;i<len;i++){
            for(int j=i+1;j<=len;j++){
                set.add(str.substring(i,j));
            }
        }


//        System.out.println(set.toString());
        sb.append(set.size());
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
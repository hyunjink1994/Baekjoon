import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();
        HashSet<Integer> set = new HashSet<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            int a = Integer.parseInt(st.nextToken());
            set.add(a);
            setA.add(a);
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            setB.add(Integer.parseInt(st.nextToken()));
        }

        
        set.retainAll(setB);

        sb.append(setA.size()+setB.size()-(2*set.size()));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
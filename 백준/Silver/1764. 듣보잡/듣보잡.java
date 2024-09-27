import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{

    static HashSet<String> answer_set = new HashSet<String>();


    public static void hashSetExist(HashSet<String> set, String str){

        if(!set.add(str)){
            answer_set.add(str);
        }


        return ;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        HashSet<String> set = new HashSet<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++){
            set.add(br.readLine());
        }

        for(int i=0;i<m;i++){
            hashSetExist(set, br.readLine());
        }

        int answer = answer_set.size();
        sb.append(answer).append("\n");

        ArrayList<String> list = new ArrayList<>(answer_set);
        Collections.sort(list);
        
        
        for(int i=0; i< list.size();i++){
            sb.append(list.get(i)).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
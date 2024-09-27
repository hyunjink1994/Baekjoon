import java.util.*;
import java.io.*;

public class Main{

    public static boolean isNumberic(String str){
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e){
            return false;
        }
    }


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        HashMap<Integer, String> hm = new HashMap<>();
        HashMap<String, Integer> rhm = new HashMap<>();

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for(int i=1 ; i<=m; i++){
            String poke = br.readLine();
            hm.put(i, poke);
            rhm.put(poke, i);
        }

        for(int i=0; i<n; i++){
            String input = br.readLine();
            if(isNumberic(input)){
                int num = Integer.parseInt(input);
                System.out.println(hm.get(num));
            }else{
                System.out.println(rhm.get(input));
            }
        }
    }

}

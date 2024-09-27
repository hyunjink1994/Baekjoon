import java.util.*;
import java.io.*;
import java.lang.*;


public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        HashSet<String> set = new HashSet<String>();

        st = new StringTokenizer(br.readLine());
        int input = Integer.parseInt(st.nextToken());

        for(int i=0; i<input;i++){
            st = new StringTokenizer(br.readLine());
            String[] arr =new String[2];
            arr[0] = st.nextToken();
            arr[1] = st.nextToken();
            if(arr[1].equals("enter")){
                set.add(arr[0]);
            }else if(arr[1].equals("leave")){
                set.remove(arr[0]);
            }
        }

        List<String> list = new ArrayList<>(set);

        Collections.sort(list, Collections.reverseOrder());

        int len = list.size();

        for(int i=0; i<len; i++){
            System.out.println(list.get(i));
        }
    }
}
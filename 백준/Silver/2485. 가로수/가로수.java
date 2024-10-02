import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{

    static StringBuilder sb = new StringBuilder();

    static int gcd(int max, int min){
        if(max % min == 0){
            return min;
        }else{
            return gcd(min, max%min);
        }
    }

    static ArrayList<Integer> diffArr(ArrayList<Integer> arr){
        ArrayList<Integer> answer = new ArrayList<>();
        int n = arr.size();

        for(int i=0; i<n-1; i++){
            answer.add(arr.get(i) - arr.get(i+1));
        }
        return answer;
    }

    static ArrayList<Integer> deleteDuplication(ArrayList<Integer> arr){
        HashSet<Integer> set = new HashSet<>(arr);
        return new ArrayList<Integer>(set);
    }


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer> arr = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        int n = Integer.parseInt(st.nextToken());

        for(int i=0; i< n; i++){
            arr.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(arr, Collections.reverseOrder());

        int length = arr.get(0) - arr.get(n-1);
        int size = arr.size();

        arr = diffArr(arr);
//        System.out.println(arr.toString());
//        System.out.println(length);
//
//        System.out.println(deleteDuplication(arr).toString());

        ArrayList<Integer> arr_dd = deleteDuplication(arr);
//        Collections.sort(arr_dd, Collections.reverseOrder());

        int arr_dd_length = arr_dd.size();

        int answer = arr_dd.get(0);

        for(int i=1; i<arr_dd_length; i++){
            int a = arr_dd.get(i);


            int max = Math.max(a,answer);
            int min = Math.min(a,answer);

            answer = gcd(max,min);
        }
        // 그냥 둘중 하나 가지고 와서 Max Min 값  찾기
            // 근데 이러면 재귀로 하나가 나올때 까지 계속 돌려야 하지 않나?
            // 고민해보셈
        sb.append((length/answer)-size+1);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
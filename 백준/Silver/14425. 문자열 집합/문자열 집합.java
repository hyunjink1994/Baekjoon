import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());


        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // n개의 문자열을 HashSet에 저장하여 빠른 탐색을 가능하게 함
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        int answer = 0;

        // m개의 문자열을 하나씩 확인하면서 HashSet에 있는지 탐색
        for (int i = 0; i < m; i++) {
            String check = br.readLine();
            if (set.contains(check)) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}

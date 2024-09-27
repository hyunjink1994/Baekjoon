import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int have_card = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> my_deck = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < have_card; i++) {
            addOrDefault(my_deck, Integer.parseInt(st.nextToken()));
        }

        int you_card = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < you_card; i++) {
            int answer_key = Integer.parseInt(st.nextToken());
            int answer = my_deck.getOrDefault(answer_key, 0); // getOrDefault로 더 간결하게
            sb.append(answer).append(" ");
        }

        // 한 번에 출력
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void addOrDefault(HashMap<Integer, Integer> map, int key) {
        map.put(key, map.getOrDefault(key, 0) + 1);
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int num = Integer.parseInt(st.nextToken());
			String str = st.nextToken();

			StringBuffer sb = new StringBuffer();
			for(int j =0; j < str.length(); j++){
				char chr = str.charAt(j);
				for (int k = 0; k < num; k++) {
					sb.append(chr);
				}
			}

			System.out.println(sb);
		}
	}
}
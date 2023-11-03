import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String str = br.readLine();

		int answer = 0;

		for (int i = 0; i < str.length(); i++) {
			char chr = str.charAt(i);

			int chr_int = (int)(chr - 'A');

			if(chr_int >= 18){
				chr_int-=1;
			}

			int cost = 3 + (chr_int / 3);

			if(cost > 10){
				cost = 10;
			}
			// System.out.printf("%s , %d\n",chr,cost);
			answer += cost;
		}
		System.out.println(answer);

	}
}
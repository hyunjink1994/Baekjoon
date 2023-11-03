import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			StringBuffer sb = new StringBuffer();
			String str = br.readLine();
			sb.append(str.charAt(0));
			sb.append(str.charAt(str.length()-1));
			System.out.println(sb);
		}
	}
}
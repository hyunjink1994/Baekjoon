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

		int n = Integer.parseInt(br.readLine());
		String str  = br.readLine();

		int answer = 0;

		for (int i = 0; i < n; i++) {
			answer += Integer.parseInt(String.valueOf(str.charAt(i)));
		}

		System.out.println(answer);

	}
}
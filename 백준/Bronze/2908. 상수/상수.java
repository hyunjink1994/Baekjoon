import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String str = br.readLine();
		st = new StringTokenizer(str, " ");
		String firstNum = st.nextToken();
		String lastNum = st.nextToken();

		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();

		for (int i = 2; i >= 0; i--) {
			sb.append(firstNum.charAt(i));
			sb2.append(lastNum.charAt(i));
		}

		System.out.println(Integer.max(Integer.parseInt(String.valueOf(sb)), Integer.parseInt(String.valueOf(sb2))));




	}
}
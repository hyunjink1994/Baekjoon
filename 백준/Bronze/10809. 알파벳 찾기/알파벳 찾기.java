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

		int[] arr = new int[26];
		char[] char_arr = new char[26];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
			char_arr[i] = (char)(97+i);
		}

		String str = br.readLine();

		for (int i = 0; i < str.length(); i++) {
			char chr = str.charAt(i);

			for (int j = 0; j < 26; j++) {
				if (chr == char_arr[j] && arr[j] == -1){
					arr[j] = i;
				}
			}
		}

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
			sb.append(" ");
		}

		System.out.println(sb);

	}
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];


		for (int i = 0; i < x; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int number =Integer.parseInt(st.nextToken());

			for (int j = start; j <=end ; j++) {
				arr[j-1] = number;
			}
		}

		StringBuffer  answer = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			answer.append(arr[i]);
			answer.append(" ");
		}

		System.out.println(answer);
	}
}
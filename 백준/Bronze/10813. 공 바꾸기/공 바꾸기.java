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


		for (int i = 0; i < n; i++) {
			arr[i] = i+1;
		}


		for (int i = 0; i < x; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int tradeX = Integer.parseInt(st.nextToken());
			int tradeY = Integer.parseInt(st.nextToken());

			int tmp = arr[tradeX-1];
			arr[tradeX-1] = arr[tradeY-1];
			arr[tradeY-1] = tmp;
		}

		StringBuffer aaaa = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			aaaa.append(arr[i]);
			aaaa.append(" ");
		}

		System.out.println(aaaa);
	}
}
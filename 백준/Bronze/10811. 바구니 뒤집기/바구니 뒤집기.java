import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuffer sb = new StringBuffer();

		st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = i+1;
		}

		for (int i = 0; i < x; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int changeX = Integer.parseInt(st.nextToken())-1;
			int changeY = Integer.parseInt(st.nextToken())-1;

			for (int j = changeX; j <= changeX+((changeY-changeX)/2); j++) {
				int tmp = arr[j];
				arr[j] = arr[changeY+changeX-j];
				arr[changeY+changeX-j] = tmp;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
			sb.append(" ");
		}

		System.out.println(sb);
	}
}
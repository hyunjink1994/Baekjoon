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
		StringBuffer sb = new StringBuffer();

		int n = Integer.parseInt(br.readLine());
		float[] arr = new float[n];

		st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		float max = findmax(arr);

		for (int i = 0; i < n; i++) {
			arr[i] = (arr[i]/max) *100;
		}

		float sum =0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}

		System.out.println(sum/n);


	}

	private static int findmax(float[] arr) {
		int answer = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(answer < arr[i]){
				answer = (int)arr[i];
			}
		}
		return answer;
	}
}
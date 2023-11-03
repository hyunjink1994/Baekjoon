import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int[] arr = new int[30];
		int[] check = new int[30];

		for (int i = 0; i < 30; i++) {
			arr[i] = i+1;
		}

		for (int i = 0; i < 28; i++) {
			check[Integer.parseInt(br.readLine()) -1] = 1;
		}

		for (int i = 0; i < 30; i++) {
			if(check[i] == 0){
				System.out.println(i+1);
			}
		}
	}
}
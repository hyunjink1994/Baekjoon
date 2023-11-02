import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int testCase = Integer.parseInt(br.readLine());

		for (int i = 1; i <= testCase; i++) {
			for (int j = testCase; j > 0; j--) {
				if(j>i){
					System.out.printf(" ");
				}else{
					System.out.printf("*");
				}
			}
			System.out.println();
		}

	}
}

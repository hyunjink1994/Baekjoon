import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int divideInt = 42;


		int[] arr = new int[10];

		HashSet<Integer> answer = new HashSet<>();

		for (int i = 0; i < 10; i++) {
			int Input = Integer.parseInt(br.readLine());
			answer.add(Input%divideInt);
		}

		System.out.println(answer.size());
	}
}
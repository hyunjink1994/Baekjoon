
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] Args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		long[] arrInput = Stream.of(bufferedReader.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

		long answer = 0;

		for(int i=0; i<arrInput.length;i++){
			answer += arrInput[i];
		}

		System.out.printf("%d\n", answer);
	}
}
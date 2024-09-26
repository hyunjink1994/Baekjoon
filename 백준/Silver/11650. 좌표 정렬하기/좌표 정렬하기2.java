import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt();

		int[][] arr = new int[N][2];

		for (int i = 0; i < N; i++) {
			arr[i][0] = in.nextInt();
			arr[i][1] = in.nextInt();
		}

		// Comparator 객체 생성
		Comparator<int[]> comp = new Comparator<int[]>() {
			@Override
			public int compare(int[] e1, int[] e2) {
				// 첫 번째 요소 비교
				if (e1[0] == e2[0]) {
					// 첫 번째 요소가 같으면 두 번째 요소 비교
					return e1[1] - e2[1];
				} else {
					// 첫 번째 요소 기준으로 정렬
					return e1[0] - e2[0];
				}
			}
		};

		// Comparator를 사용한 정렬
		Arrays.sort(arr, comp);

		// 정렬된 배열 출력
		for (int i = 0; i < N; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}
}

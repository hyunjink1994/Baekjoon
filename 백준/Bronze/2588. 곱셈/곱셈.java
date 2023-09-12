
import java.util.Scanner;

public class Main {

	public static void main(String[] Args){
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		for(int i=1; i<=3; i++){
			int x= B;
			for(int j=1; j<i ; j++){
				x/=10;
			}
			x %=10;

			System.out.printf("%d\n", A*x);
		}

		System.out.printf("%d\n", A*B);
	}
}
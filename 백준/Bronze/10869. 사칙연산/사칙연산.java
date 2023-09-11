
import java.util.Scanner;

public class Main {

	public static void main(String[] Args){
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		System.out.printf("%d\n", x+y);
		System.out.printf("%d\n", x-y);
		System.out.printf("%d\n", x*y);
		System.out.printf("%d\n", x/y);
		System.out.printf("%d\n", x%y);
	}
}

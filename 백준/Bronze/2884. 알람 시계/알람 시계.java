import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int answer = 0;

		if(x > 0 && y >= 45){
			y -=45;
		} else if (x > 0 && y <45) {
			x-=1;
			y +=15;
		} else if (x == 0 && y >= 45){
			y-=45;
		} else if(x == 0 && y <45){
			x = 23;
			y+=15;
		}

		System.out.printf("%d %d",x,y);
	}
}

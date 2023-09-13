import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		y+=z;

		x+= y/60;
		y = y%60;
		if(x>=24){
			x-=24;
		}

		System.out.printf("%d %d",x,y);


	}
}

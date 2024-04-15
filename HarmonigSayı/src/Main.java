import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("N sayısını girin : ");
		int n = input.nextInt();
		
		double restult = 0.0;
		
		for(int i = 1; i <= n; i++) {
			restult += (1.0/i);
		}
		
		System.out.print(restult);
	}

}

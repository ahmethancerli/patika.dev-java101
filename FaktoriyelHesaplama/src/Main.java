import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("bir sayı girin : ");
		int n = input.nextInt();
		int toplam = 1;
		for(int i = 1; i <= n; i++) {
			toplam *= i;
		}
		System.out.print(n + " faktoriyel " + toplam);
	}

}

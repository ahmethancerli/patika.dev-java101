import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Sayı Girin : ");
		int k = input.nextInt();
		
		for(int i = 1; i <= k; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
6
	}

}

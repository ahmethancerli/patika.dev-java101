import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("1. Sayı : ");
		int a = input.nextInt();
		
		System.out.print("2. Sayı : ");
		int b= input.nextInt();
		
		System.out.print("3. Sayı : ");
		int c = input.nextInt();
		
		if((a > b) && (a > c)) {
			if(b > c) {
				System.out.print("a > b > c");
			}
			else {
				System.out.print("a > c > b");
			}
		}
		else if((b > a) && (b > c)) {
			if(a > c) {
				System.out.print("b > a > c");
			}
			else {
				System.out.print("b > c > a");
			}
		}
		else {
			System.out.print("c > b > a");
		}
		
		

	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("sınıf sayısını girin : ");
		n = input.nextInt();
		for(int i = 1; i <=n; i*=2) {
			System.out.println(i);
		}

	}

}

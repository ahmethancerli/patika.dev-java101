import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n1, n2, select;
		
		System.out.print("Birinci sayıyı girin : ");
		n1 = input.nextInt();
		System.out.print("İkinci sayıyı girin : ");
		n2 = input.nextInt();
		
		System.out.println("1-TOPLAMA\n2-ÇIKARMA\n3-ÇARPMA\n4-BÖLME");
		System.out.print("SEÇİM YAPINIZ : ");
		select = input.nextInt();
		
		switch(select) {
		case 1:
			System.out.println("SONUÇ : " + (n1 + n2));
			break;
		case 2:
			System.out.println("SONUÇ : " + (n1 - n2));
			break;
		case 3:
			System.out.println("SONUÇ : " + (n1 * n2));
			break;
		case 4:
			System.out.println("SONUÇ : " + (n1 / n2));
			break;
		default:
			System.out.print("GEÇERSİZ...");
			break;
		}

	}

}

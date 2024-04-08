import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		
		Scanner inp = new Scanner(System.in);
		
		int km;
		double perKm = 2.20, total, startPrice = 10;
		
		System.out.print("Mesafeyi km cinsinden girin : ");
		km = inp.nextInt();
		
		total = (km * perKm);
		total += startPrice;
		
		total = (total < 20) ? 20 : total;
		
		System.out.print("Toplam tutrar : " + total);
	}
}

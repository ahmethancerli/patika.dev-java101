import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/* ÖDEV PATİKA.DEV JAVA101
		 
		  Java döngüler ile tek bir sayı girilene kadar 
		  kullanıcıdan girişleri kabul eden ve girilen değerlerden 
		  çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
		 */
		
		Scanner input = new Scanner(System.in);
		int toplam = 0;
		int sayi;
		do {
			System.out.print("Bir Sayı Girin :  ");
			sayi = input.nextInt();
			if(sayi % 2 == 0 && sayi % 4 == 0) {
				toplam += sayi;
			}
		} while(sayi % 2 != 1);
		
		 System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + toplam);
		 
	}

}
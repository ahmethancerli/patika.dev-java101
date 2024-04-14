import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in) ;
		
		System.out.print("Bir Sayı Girin : ");
		int sayi = input.nextInt();
		
		int toplam = 0;
		int adet = 0;
		
		for(int i = 0; i <= sayi; i++) {
			if(i % 3 == 0 && i % 4 == 0) {
				toplam += i;
				adet++;
			}
		}
		
		 double ortalama = 0;
	        if (adet > 0) {
	            ortalama = (double) toplam / adet;
	        }
	        
	        System.out.println("0'dan " + sayi + "'e kadar olan 3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
	}
}

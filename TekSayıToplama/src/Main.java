import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 Pratik - Tek Sayıların Toplamını Program
		 Java döngüler ile negatif bir değer girilene kadar 
		 kullanıcıdan girişleri kabul eden ve girilen değerlerden tek sayıları toplayıp 
		 ekrana basan programı yazıyoruz. 
		 */
		
		Scanner input = new Scanner(System.in);
		
		int toplam = 0;
		int n;
		
		do {
			System.out.print("Bir Sayı Girin : ");
			n = input.nextInt();
			
			if(n % 2 == 1) {
				toplam += n;			
			} 
		} while(n > 0);
		
		System.out.print("Toplam : " + toplam);
	}

}

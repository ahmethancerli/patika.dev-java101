import java.util.Scanner;

public class Main {
	
	static int usAlma(int taban, int us) {
		if(us == 0)
			return 1;
		else
			return taban * usAlma(taban, us - 1);
	}
	
	public static void main(String[] args) {
		
		/* ÖDEV PATİKA.DEV JAVA101
		 
		Recursive Metotlar ile Üslü Sayı Hesaplama
		Java dilinde, taban ve üs değerleri kullanıcıdan alınan 
		üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.

		Senaryo
		Taban değeri giriniz :2 Üs değerini giriniz : 0
		Sonuç : 1
		Taban değeri giriniz : 2
		Üs değerini giriniz : 3
		Sonuç : 8
		Taban değeri giriniz : 5
		Üs değerini giriniz : 3
		Sonuç : 125*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Taban değerini girin : ");
		int taban = input.nextInt();
		
		System.out.print("Üs değerini girin : ");
		int us = input.nextInt();
		
		System.out.println("Sonuç: " + usAlma(taban, us));		
	}

}

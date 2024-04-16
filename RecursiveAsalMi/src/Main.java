import java.util.Scanner;

public class Main {
	
	static boolean asalMi(int sayi, int i) {
		if(i <= 1) 
			return true;
		if(sayi % 1 == 0)
			return false;
		return asalMi(sayi, i - 1);		
	}
	
	public static void main(String[] args) {
		
		/* ÖDEV PATİKA.DEV JAVA101
		 
		 Java dilinde "Recursive" metot kullanarak, 
		 kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.

		Senaryo
		
		Sayı Giriniz : 22
		22 sayısı ASAL değildir !

		Sayı Giriniz : 2
		2 sayısı ASALDIR !

		Sayı Giriniz : 39
		39 sayısı ASAL değildir !
	
		Sayı Giriniz : 17
		17 sayısı ASALDIR ! */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Bir sayı girin : ");
		int sayi = input.nextInt();
		
		if(sayi < 2) 
			System.out.print(sayi + "Sayısı ASAL değildir !");
		else if (asalMi(sayi, sayi / 2))
            System.out.println(sayi + " sayısı ASALDIR !");
        else
            System.out.println(sayi + " sayısı ASAL değildir !");
	}

}

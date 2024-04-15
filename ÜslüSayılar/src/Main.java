import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Taban Sayısını Girin : ");
		int taban = input.nextInt();
		
		System.out.print("Üssü Sayısını Girin : ");
		int us = input.nextInt();
		
		int sonuc = 1;
		
		for(int i = 1; i <= us; i++) {
			sonuc *= taban;					
		}
		 
		System.out.println(taban + "^" + us + " = " + sonuc);
	}

}

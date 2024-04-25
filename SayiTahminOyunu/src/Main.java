import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		int number = rand.nextInt(0, 10);
		int rigth = 0;
		int[] isWrong = new int[5];
		
		while(rigth < 5) {
			System.out.print("Lütfen bir sayı tahmin edin : ");
			int selected = input.nextInt();
			
			if(selected < 0 || selected > 99) {
				System.out.print("Lütfen 0-100 arasında bir sayi girin : ");
				continue;
			}
			
			if(selected == number) {
				System.out.print(number + " Tebrikler doğru tahminde bulundunuz ...");
				break;
			} else {
				System.out.print(number + " Üzgünüz yanlış tahmin tahmin ettiniz ...");
				
				if(selected > number) {
					System.out.print("Gizli sayı tahin ettiğiniz sayıdan büyük ...");
				} else {
					System.out.print("Gizli sayı tahin ettiğiniz sayıdan küçük ...");
				}
				
				System.out.print("Kalan hakkınız : " + (5 - rigth));
			}
			
		}
		
	}

}

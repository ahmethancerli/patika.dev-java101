import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    	/* ÖDEV PATİKA.DEV JAVA101
    	 
    	 Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan 
    	 ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” 
    	 değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.

    	Mükemmel Sayı Nedir ?
    	Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.

    	Senaryolar
    	Bir sayı giriniz: 28
    	28 Mükemmel sayıdır
    	Bir sayı giriniz: 1
    	1 Mükemmel sayı değildir.
    	Bir sayı giriniz: 496
    	496 Mükemmel sayıdır*/
    	
    	Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        
        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        
        if (toplam == sayi) {
            System.out.println(sayi + " Mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " Mükemmel sayı değildir.");
        }
    }
}
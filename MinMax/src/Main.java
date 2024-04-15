import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    	/*
    	 * 
    	  ÖDEV PATİKA.DEV JAVA101
    	  
    	  Java ile klavyeden girilen N tane sayma sayısından 
    	  en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

		 Senaryo
		 Kaç tane sayı gireceksiniz: 4
		 1. Sayıyı giriniz: 16
		 2. Sayıyı giriniz: -22
		 3. Sayıyı giriniz: -15
		 4. Sayıyı giriniz: 100
		 En büyük sayı: 100
		 En küçük sayı: -22
    	 */
    	
    	Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = scanner.nextInt();
        
        int[] sayilar = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Sayıyı giriniz: ");
            sayilar[i] = scanner.nextInt();
        }
        
        int enBuyuk = sayilar[0];
        int enKucuk = sayilar[0];
        
        for (int i = 1; i < n; i++) {
            if (sayilar[i] > enBuyuk) {
                enBuyuk = sayilar[i];
            }
            if (sayilar[i] < enKucuk) {
                enKucuk = sayilar[i];
            }
        }
        
        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }
}
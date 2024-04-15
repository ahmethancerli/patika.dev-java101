import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();
        
        int toplam = 0;
        int kalan;
        
        // Sayının basamaklarını toplama işlemi
        while (sayi != 0) {
            kalan = sayi % 10; // Son basamağı bul
            toplam += kalan; // Son basamağı toplama ekle
            sayi /= 10; // Sayıyı bir basamak sağa kaydır
        }
        
        System.out.println("Girilen sayının basamaklarının toplamı: " + toplam);
    }
}
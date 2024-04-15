import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("İlk sayıyı girin: ");
        int sayi1 = scanner.nextInt();
        
        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();
        
        int ebob = 1;
        int ekok;
        
        // EBOB hesaplama
        int min = Math.min(sayi1, sayi2);
        int i = 1;
        while (i <= min) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        
        // EKOK hesaplama
        ekok = (sayi1 * sayi2) / ebob;
        
        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}
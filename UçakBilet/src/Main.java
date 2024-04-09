
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
    	/*	PATİKA.DEV JAVA101 ÖDEV
    	 	Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
			Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
			Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
			Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
			Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
			Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/
    	
    	Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        int mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        int yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int yolculukTipi = input.nextInt();

        double toplamTutar = 0;
        double mesafeUcreti = mesafe * 0.10;

        if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            if (yas < 12) {
                toplamTutar = mesafeUcreti - (mesafeUcreti * 0.50);
            } else if (yas >= 12 && yas <= 24) {
                toplamTutar = mesafeUcreti - (mesafeUcreti * 0.10);
            } else if (yas >= 65) {
                toplamTutar = mesafeUcreti - (mesafeUcreti * 0.30);
            } else {
                toplamTutar = mesafeUcreti;
            }

            if (yolculukTipi == 2) {
                toplamTutar *= 2 * 0.80; // %20 indirim
            }

            System.out.println("Toplam Tutar = " + toplamTutar + " TL");
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }

        input.close();
    }
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 PATİKA.DEV JAVA101 ÖDEV 
		 
		 Manav Kasa Programı
		 Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

		 Meyveler ve KG Fiyatları
		 Armut : 2,14 TL
		 Elma : 3,67 TL
		 Domates : 1,11 TL
		 Muz: 0,95 TL
		 Patlıcan : 5,00 TL
		 
		 Örnek Çıktı;
		 Armut Kaç Kilo ? :0
 		 Elma Kaç Kilo ? :1
		 Domates Kaç Kilo ? :1
		 Muz Kaç Kilo ? :2
		 Patlıcan Kaç Kilo ? :3
		 Toplam Tutar : 21.68 TL
		 */
		
		Scanner scanner = new Scanner(System.in);
		
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        System.out.print("Armut Kaç Kilo ? : ");
        double armutKilo = scanner.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        double elmaKilo = scanner.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        double domatesKilo = scanner.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        double muzKilo = scanner.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        double patlicanKilo = scanner.nextDouble();

       
        double toplamTutar = armutFiyat * armutKilo + elmaFiyat * elmaKilo + domatesFiyat * domatesKilo + muzFiyat * muzKilo + patlicanFiyat * patlicanKilo;

        System.out.println("Toplam Tutar : " + String.format("%.2f", toplamTutar) + " TL");
    }
}



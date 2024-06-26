import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* ÖDEV PATİKA.DEV JAVA101
		 
		  Java ile kullanıcının girdiği yılın artık olup olmadığını bulan programı yazınız.
		  Artık Yıl Nedir?
		  Artık yıl, Miladî takvimde 365 yerine 366 günü olan yıl. Bu fazladan gün (artık gün), normalde 28 gün olan şubat ayına 29 Şubat’ın eklenmesi ile elde edilir.
		  Artık Yıl Nasıl Hesaplanır?
		  Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:
  		  1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
		  100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:
		  Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.
		  Sadece 400'e tam olarak bölünebilenlerin artık yıl kabul edilmesinin nedeni, bir astronomik yılın 365,25 gün değil, yaklaşık olarak 365,242 gün olmasından kaynaklanan hatayı gidermektir.
		  Senaryo
		  Yıl Giriniz : 2020
		  2020 bir artık yıldır !
		  Yıl Giriniz : 2021
		  2021 bir artık yıldır değildir !*/
		 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Yıl Giriniz : ");
		int yil = input.nextInt();
		
		if((yil % 2 == 0 && yil % 100 != 0) || (yil % 400 ==0)) {
			System.out.println(yil + " Artık Yıldır");
		} else {
			System.out.print(yil + " Artık Yıl Değildir");
		}

	}

}

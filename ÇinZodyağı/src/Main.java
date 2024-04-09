import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/* PATİKA.DEV JAVA101 ÖDEV 
		 Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.
		 Çin Zodyağı nedir?
		 4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.
		 Çin Zodyağı nasıl hesaplanır?
		 Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
		 Doğum Tarihi %12 = 0 ➜ Maymun
		 Doğum Tarihi %12 = 1 ➜ Horoz
		 Doğum Tarihi %12 = 2 ➜ Köpek
		 Doğum Tarihi %12 = 3 ➜ Domuz
		 Doğum Tarihi %12 = 4 ➜ Fare
		 Doğum Tarihi %12 = 5 ➜ Öküz
		 Doğum Tarihi %12 = 6 ➜ Kaplan
		 Doğum Tarihi %12 = 7 ➜ Tavşan
		 Doğum Tarihi %12 = 8 ➜ Ejderha
		 Doğum Tarihi %12 = 9 ➜ Yılan
		 Doğum Tarihi %12 = 10 ➜ At
		 Doğum Tarihi %12 = 11 ➜ Koyun*/
		
		 	Scanner input = new Scanner(System.in);

	        System.out.print("Doğum Yılınızı Giriniz: ");
	        int dogumYili = input.nextInt();
	       
	        String cinZodyagi = "";
	        
	        switch (dogumYili % 12) {
	            case 0:
	                cinZodyagi = "Maymun";
	                break;
	            case 1:
	                cinZodyagi = "Horoz";
	                break;
	            case 2:
	                cinZodyagi = "Köpek";
	                break;
	            case 3:
	                cinZodyagi = "Domuz";
	                break;
	            case 4:
	                cinZodyagi = "Fare";
	                break;
	            case 5:
	                cinZodyagi = "Öküz";
	                break;
	            case 6:
	                cinZodyagi = "Tiger";
	                break;
	            case 7:
	                cinZodyagi = "Tavşan";
	                break;
	            case 8:
	                cinZodyagi = "Ejderha";
	                break;
	            case 9:
	                cinZodyagi = "Yılan";
	                break;
	            case 10:
	                cinZodyagi = "At";
	                break;
	            case 11:
	                cinZodyagi = "Koyun";
	                break;
	            default:
	                System.out.println("Hatalı bir değer girdiniz!");
	        }

	        System.out.println("Çin Zodyağı Burcunuz: " + cinZodyagi);

	        input.close();
		
	}

}

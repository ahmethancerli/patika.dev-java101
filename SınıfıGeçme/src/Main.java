import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double mat, fizik, turkce, kimya, muzik;
		
		System.out.print("Matemaitk Notunuz :");
		mat = input.nextDouble();
		
		System.out.print("Fizik Notunuz :");
		fizik = input.nextDouble();
		
		System.out.print("Türkçe Notunuz :");
		turkce = input.nextDouble();
		
		System.out.print("Kimya Notunuz :");
		kimya = input.nextDouble();
		
		System.out.print("Müzik Notunuz :");
		muzik = input.nextDouble();
		
		double ortalama = (mat + fizik + turkce + kimya + muzik) /5;
		
		if(ortalama <= 55) {
			System.out.println("Sınıfta Kaldınız ...");
		}
		else {
			System.out.println("Tebrikler Sınıfı Geçtiniz ...");
		}
		
		System.out.println("Ortalamanız : " + ortalama);

	}

}

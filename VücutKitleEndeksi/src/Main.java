import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Lütfen boyunuzu metre cinsinden giriniz : ");
		double boy = inp.nextDouble();
		
		System.out.print("Lütfen kilonuzu giriniz : ");
		double kilo = inp.nextDouble();
		
		double vucutKitle = kilo / (boy * boy);
		
		System.out.print("Vücut kitle endeksiniz : " + vucutKitle);
		

	}

}

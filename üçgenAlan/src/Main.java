package üçgenAlan;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		double kenar1, kenar2, kenar3;
		
		System.out.print("1. kenar : "); kenar1 = inp.nextDouble();
		System.out.print("2. kenar : "); kenar2 = inp.nextDouble();
		System.out.print("3. kenar : "); kenar3 = inp.nextDouble();
		
		double yariCevre = (kenar1 + kenar2 + kenar3) / 2;
	    double alan = Math.sqrt(yariCevre * (yariCevre - kenar1) * (yariCevre - kenar2) * (yariCevre - kenar3));

	    System.out.println("Üçgenin alanı: " + alan);
		
		

	}

}

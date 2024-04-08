package kdvHesaplama;

import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		
		Scanner inp = new Scanner(System.in);
		
		double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;
		
		System.out.print("Ücret tutarını girin : ");
		tutar = inp.nextDouble();
		
		kdvTutar = tutar * kdvOran;
		kdvliTutar = tutar + kdvTutar;
		
		if (tutar <= 1000) {
            kdvOran = 0.18; 
        } else {
            kdvOran = 0.08; 
        }
		
		System.out.println("KDV'siz oran : " + tutar);
		System.out.println("KDV oranı : " + kdvOran);
		System.out.println("KDV tutarı : " + kdvTutar);
		System.out.println("KDV'li tutar : " + kdvliTutar);
	}
}

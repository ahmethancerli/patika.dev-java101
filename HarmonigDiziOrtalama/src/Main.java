import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/* ÖDEV PATİKA.DEV JAVA101
		Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

		Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi

		Harmonik Seri Formülü :*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Dizinin eleman sayısını girin : ");
		int n = input.nextInt();
		
		double[] dizi = new double[n];
		
		System.out.print("Dizinin elemanlarını girin : ");
		
		for(int i = 0; i < n ; i++) {
			 System.out.print("[" + (i+1) + "] : ");
	            dizi[i] = input.nextDouble();
		}
		
		double harmonikToplam = 0;

        for (int i = 0; i < n; i++) {
            harmonikToplam += (1.0 / dizi[i]);
        }

        double harmonikOrtalama = n / harmonikToplam;

        System.out.println("Dizinin harmonik ortalaması: " + harmonikOrtalama);

        input.close();

	}

}


public class Main {

	public static void main(String[] args) {
        
		/* ÖDEV PATİKA.DEV JAVA101
		 
		Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.

		Senaryo
		2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 */
		
		System.out.println("Asal sayılar 1-100 arasında:");
        for (int i = 2; i <= 100; i++) {
            boolean asalMi = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    asalMi = false;
                    break;
                }
            }
            if (asalMi) {
                System.out.print(i + " ");
            }
        }
    }
}
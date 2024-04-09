import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Koşullar :
		 Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
 		 Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
		 Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
		 Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Sıcaklık Girin : ");
		int heat = input.nextInt();
		
		if(heat < 5) {
			System.out.print("Kayak Yapabilirsin ...");
		}
		else if(heat >=5 && heat <= 25) {
			if(heat <=15) {
				System.out.println("Sinemaya Gidebilirsin ...");
			}
			if(heat >= 10) {
				System.out.println("Pikniğe Gidebilirsin ...");
			}
		}
		else {
			System.out.println("Yüzmeye Gidebilirsin ...");
		}
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
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

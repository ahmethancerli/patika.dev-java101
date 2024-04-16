
public class Main {
	
	static boolean Ispalindrom(int number) {
		int temp = number, reverseNumber = 0, lastNumber;
		while(temp != 0) {
			System.out.print("sayı -> "+ temp);
			lastNumber = temp % 10;
			System.out.print("sn basamak ->" +lastNumber);t
			reverseNumber = (reverseNumber * 10) + lastNumber;
			System.out.print("yeni sayı -> "+ reverseNumber);
			temp /= 10;
		}
		
		return true;
				
	}
	
	public static void main(String[] args) {
		

	}

}
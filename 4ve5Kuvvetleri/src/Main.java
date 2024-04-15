import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    	/* ÖDEV PATİKA.DEV JAVA101
    	 Java döngüler ile girilen sayıya kadar olan 
    	 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
    	 */
    	
    	Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();
        
        for (int i = 1; i <= sayi; i++) {
            System.out.println("4^" + i + " = " + Math.pow(4, i));
            System.out.println("5^" + i + " = " + Math.pow(5, i));
        }
    }
}
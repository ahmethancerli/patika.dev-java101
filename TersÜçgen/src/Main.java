import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    	/* ÖDEV PATİKA.DEV JAVA101
    	 
    	 Java ile basamak sayısının kullanıcıdan alınan 
    	 ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.

    	Örnek
    	Basamak Sayısı : 10

    	*******************
    	*****************
    	***************
    	*************
    	*********** 
    	********* 
    	******* 
    	***** 
    	*** 
    	*
    	*/
    	
    	Scanner scanner = new Scanner(System.in);
        
        System.out.print("Basamak Sayısı: ");
        int basamakSayisi = scanner.nextInt();
        
        for (int i = basamakSayisi; i >= 1; i--) {
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
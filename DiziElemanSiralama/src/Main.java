import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/* ÖDEV PATİKA.DEV JAVA101
		 Java dilinde, dizideki elemanları küçükten büyüğe 
		 sıralayan programı yazınız. Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.

		Senaryo
		Dizinin boyutu n : 5
		Dizinin elemanlarını giriniz :
		1. Elemanı : 99
		2. Elemanı : -2
		3. Elemanı : -2121
		4. Elemanı : 1
		5. Elemanı : 0
		Sıralama : -2121 -2 0 1 99


		Dizinin boyutu n : 6
		Dizinin elemanlarını giriniz :
		1. Elemanı : 1000221
		2. Elemanı : 22
		3. Elemanı : -1
		4. Elemanı : 999
		5. Elemanı : 0
		6. Elemanı : 254
		Sıralama : -1 0 22 254 999 1000221 */
		
		Scanner input = new Scanner(System.in);		
		
		System.out.print("Dizinin boyutu n : ");
		int n = input.nextInt();	
		
		int[] arr = new int[n];
		
		System.out.println("Dizinin elemanlarını girin : ");
		
		for(int i = 0; i < n; i++) {
			System.out.print((i + 1) + ". Elemanı: ");
            arr[i] = input.nextInt();
		}
		
		Arrays.sort(arr);

        System.out.print("Sıralama: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " < ");
        }
	}

}

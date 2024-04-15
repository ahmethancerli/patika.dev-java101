import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    	/* ÖDEV PATİKA.DEV JAVA101
    	 
    	 Java döngüler ile fibonacci serisi bulan program yazıyoruz.
    	 Fibonacci serisinin eleman sayısını kullanıcıdan alın.

    	Fibonacci Serisi Nedir ?
    	Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir. Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar, yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.

    	Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla toplanır. Elde edilen sonuç rakamın sağ tarafına yazılır. Fibonacci dizisinin ilk on sayısı şu şekildedir:

    	9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34

    	 0 + 1 = 1

    	 1 + 1 = 2

    	 1 + 2 = 3

    	 2 + 3 = 5

    	 3 + 5 = 8

    	 5 + 8 = 13

    	 13 + 8 = 21

    	 21 + 13 = 34*/
    	
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını girin: ");
        int elemanSayisi = scanner.nextInt();

        int sayi1 = 0, sayi2 = 1;
        System.out.println(elemanSayisi + " Elemanlı Fibonacci Serisi:");
        System.out.print(sayi1 + " " + sayi2 + " ");

        for (int i = 2; i < elemanSayisi; i++) {
            int gecici = sayi1 + sayi2;
            System.out.print(gecici + " ");
            sayi1 = sayi2;
            sayi2 = gecici;
        }
    }
}
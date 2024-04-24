import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
    	/* ÖDEV PATİKA.DEV JAVA101
    	 Java dilinde, dizideki elemanların kaç kez tekrar 
    	 edildiğini yani frekanslarını bulan programı yazınız.

    	Senaryo
    	Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
    	Tekrar Sayıları
    	10 sayısı 3 kere tekrar edildi.
    	20 sayısı 4 kere tekrar edildi.
    	5 sayısı 1 kere tekrar edildi.*/
    	
    	int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }

        System.out.println("Tekrar Sayıları");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " sayısı " + entry.getValue() + " kere tekrar edildi.");
        }
    }
}
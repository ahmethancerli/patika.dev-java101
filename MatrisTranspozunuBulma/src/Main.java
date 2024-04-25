import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
    /* ÖDEV PATİKA.DEV JAVA101 
     Java dilinde, çok boyutlu diziler ile oluşturulmuş 
     matrisin transpozunu bulan programı yazınız.

    	Matrisin transpozunu (devriğini) almak, matrisin aynı 
    	numaralı satırları ile sütunlarının yer değiştirmesi 
    	demektir. Bu işlem sonucu elde edilen matris, başlangıçtaki 
    	matrisin transpozudur (devriğidir). Bu aşamada kxn’lik bir 
    	matrisin transpozu (devriği) nxk’lik bir matris olur. 
    	Örneğin bir A matrisimiz olsun. Bu A matrisinin transpozu (devriği), A^T (A üzeri T) ile gösterilir.


    	Senaryo
    	Matris : 
    	2    3    4    
    	5    6    4    
    	Transpoze : 
    	2    5    
    	3    6    
    	4    4    


    	Matris : 
    	1    2    3    
    	4    5    6    
    	Transpoze : 
    	1    4    
    	2    5    
    	3    6    */
    	
    	int[][] matris = {
            {2, 3, 4},
            {5, 6, 4}
        };
        
        System.out.println("Matris:");
        matrisiYazdir(matris);
        
        int[][] transpoze = transpozAl(matris);
        
        System.out.println("Transpoze:");
        matrisiYazdir(transpoze);
    }
    
   
    public static void matrisiYazdir(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    
    public static int[][] transpozAl(int[][] matris) {
        int satirSayisi = matris.length;
        int sutunSayisi = matris[0].length;
        int[][] transpoze = new int[sutunSayisi][satirSayisi];
        
        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                transpoze[j][i] = matris[i][j];
            }
        }
        
        return transpoze;
    }
}
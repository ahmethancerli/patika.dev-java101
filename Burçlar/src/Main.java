import java.util.Scanner;

public class Main {
    
    public static void main(String [] args) {
        
        /* Koç Burcu : 21 Mart - 20 Nisan
           Boğa Burcu : 21 Nisan - 21 Mayıs
           İkizler Burcu : 22 Mayıs - 22 Haziran
           Yengeç Burcu : 23 Haziran - 22 Temmuz
           Aslan Burcu : 23 Temmuz - 22 Ağustos
           Başak Burcu : 23 Ağustos - 22 Eylül
           Terazi Burcu : 23 Eylül - 22 Ekim
           Akrep Burcu : 23 Ekim - 21 Kasım
           Yay Burcu : 22 Kasım - 21 Aralık
           Oğlak Burcu : 22 Aralık - 21 Ocak
           Kova Burcu : 22 Ocak - 19 Şubat
           Balık Burcu : 20 Şubat - 20 Mart */
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Doğduğunuz Ay (1-12): ");
        int ay = input.nextInt();
        
        System.out.print("Doğduğunuz Gün: ");
        int gun = input.nextInt();
        
        switch (ay) {
            case 1: // Ocak
                if (gun >= 1 && gun <= 31) {
                    if (gun < 22) {
                        System.out.print("Oğlak Burcu");
                    } else {
                        System.out.print("Kova Burcu");
                    }
                } else {
                    System.out.print("HATALI");
                }
                break;
            case 2: // Şubat
                if (gun >= 1 && gun <= 29) { // Şubat ayı için gün sınırı (artık yıllar için)
                    if (gun < 20) {
                        System.out.print("Kova Burcu");
                    } else {
                        System.out.print("Balık Burcu");
                    }
                } else {
                    System.out.print("HATALI");
                }
                break;
            case 3: // Mart
                if (gun >= 1 && gun <= 31) {
                    if (gun < 21) {
                        System.out.print("Balık Burcu");
                    } else {
                        System.out.print("Koç Burcu");
                    }
                } else {
                    System.out.print("HATALI");
                }
                break;
            case 4: // Nisan
                if (gun >= 1 && gun <= 30) {
                    if (gun < 21) {
                        System.out.print("Koç Burcu");
                    } else {
                        System.out.print("Boğa Burcu");
                    }
                } else {
                    System.out.print("HATALI");
                }
                break;
            case 5: // Mayıs
                if (gun >= 1 && gun <= 31) {
                    if (gun < 22) {
                        System.out.print("Boğa Burcu");
                    } else {
                        System.out.print("İkizler Burcu");
                    }
                } else {
                    System.out.print("HATALI");
                }
                break;
            case 6: // Haziran
                if (gun >= 1 && gun <= 30) {
                    if (gun < 23) {
                        System.out.print("İkizler Burcu");
                    } else {
                        System.out.print("Yengeç Burcu");
                    }
                } else {
                    System.out.print("HATALI");
                }
                break;
            case 7: // Temmuz
                if (gun >= 1 && gun <= 31) {
                    if (gun < 23) {
                        System.out.print("Yengeç Burcu");
                    } else {
                        System.out.print("Aslan Burcu");
                    }
                } else {
                    System.out.print("HATALI");
                }
                break;
            case 8: // Ağustos
                if (gun >= 1 && gun <= 31) {
                    if (gun < 23) {
                        System.out.print("Aslan Burcu");
                    } else {
                        System.out.print("Başak Burcu");
                    }
                } else {
                    System.out.print("HATALI");
                }
                break;
            case 9: // Eylül
                if (gun >= 1 && gun <= 30) {
                    if (gun < 23) {
                        System.out.print("Başak Burcu");
                    } else {
                        System.out.print("Terazi Burcu");
                    }
                } else {
                    System.out.print("HATALI");
                }
                break;
            case 10: // Ekim
                if (gun >= 1 && gun <= 31) {
                    if (gun < 23) {
                        System.out.print("Terazi Burcu");
                    } else {
                        System.out.print("Akrep Burcu");
                    }
                } else {
                    System.out.print("HATALI");
                }
                break;
            case 11: // Kasım
                if (gun >= 1 && gun <= 30) {
                    if (gun < 22) {
                        System.out.print("Akrep Burcu");
                    } else {
                        System.out.print("Yay Burcu");
                    }
                } else {
                    System.out.print("HATALI");
                }
                break;
            case 12: // Aralık
                if (gun >= 1 && gun <= 31) {
                    if (gun < 22) {
                        System.out.print("Yay Burcu");
                    } else {
                        System.out.print("Oğlak Burcu");
                    }
                } else {
                    System.out.print("HATALI");
                }
                break;
            default:
                System.out.print("Geçersiz ay numarası");
        }
    }
}
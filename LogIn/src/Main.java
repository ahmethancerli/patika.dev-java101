import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String userName, password;
		
		System.out.print("Kullanıcı Adı : ");
		userName = input.nextLine();
		System.out.print("Parola : ");
		password = input.nextLine();
		
		if(userName.equals("Ahmet Hançerli") && password.equals("java101")) {
			System.out.print("Hoş Geldin " + userName);
		}
		else {
			System.out.println("Kullanıcı Adı Veya Parola Hatalı");
			
			System.out.print("Parolanızı Sıfırlamak İster Misiniz? (Evet/Hayır): ");
            String response = input.nextLine();

            if (response.equalsIgnoreCase("Evet")) {
                System.out.print("Yeni Parolanızı Girin: ");
                String newPassword = input.nextLine();

                if (!newPassword.equals(password)) {
                    System.out.println("Parola Oluşturuldu");
                } else {
                    System.out.println("Parola Oluşturulamadı, lütfen başka şifre giriniz.");
                }
            }
		}
	}

}

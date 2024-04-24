import java.time.Year;

public class Calisan {
	
	String ad;
	double maas;
	int haftalikCalismaSaati;
	double iseBaslangicYili;
	
	Calisan(String ad, double maas, int haftalikCalismaSaati, double iseBaslangicYili){
		this.ad = ad;
		this.maas = maas;
		this.haftalikCalismaSaati = haftalikCalismaSaati;
		this.iseBaslangicYili = iseBaslangicYili;
	}
	
	public double vergi() {
		if(maas > 1000) {
			return maas * 0.03;
		}
		else {
			return 0;
		}
	}
	
	public double bonus() {
		if(haftalikCalismaSaati > 40) {
			return (haftalikCalismaSaati - 40) * 30;
		}
		else {
			return 0;
		}
	}
	
	public double maasArtisi() {
		 int calismaYili = Year.now().getValue() - (int) iseBaslangicYili;
		 if(calismaYili < 10) {
			 return maas * 0.05;
		 }
		 else if(calismaYili < 20) {
			 return maas * 0.10;
		 }
		 else {
			 return maas * 0.15;
		 }
	}
	
	  public String toString() {
	        return "Adı : " + ad + "\n" +
	               "Maaşı : " + maas + "\n" +
	               "Çalışma Saati : " + haftalikCalismaSaati + "\n" +
	               "Başlangıç Yılı : " + iseBaslangicYili + "\n" +
	               "Vergi : " + vergi() + "\n" +
	               "Bonus : " + bonus() + "\n" +
	               "Maaş Artışı : " + maasArtisi() + "\n" +
	               "Vergi ve Bonuslar ile birlikte maaş : " + (maas - vergi() + bonus() + maasArtisi());
	    }
	
}
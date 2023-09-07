package lesson15;

public class UserManager {
	
	
	
	public static String generateEmail(String name, String surName) {

		return name+"."+surName+"@xbank.com";
	}
	
	public void krediBasvurusundaBulun(Account account, double miktar) {
		account.setKrediBasvurusu(true);
		account.setIstenenKrediMiktari(miktar);
		
		System.out.println(miktar+" Değerinde kredi talebinde bulundunuz");
		System.out.println("lütfen onay bekleyiniz...");
	}
	
	
	
	
}

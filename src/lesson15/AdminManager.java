package lesson15;

public class AdminManager {
	
	public void basvuruOnayla(Account account) {
		if (account.isKrediBasvurusu()) {
			System.out.println("Kredi başvurunuz onaylanmıştır.");
			account.setMoney(account.getMoney()+account.getIstenenKrediMiktari());
			account.setIstenenKrediMiktari(0);
			account.setKrediBasvurusu(false);
		}else {
			System.out.println(account.getaccountNumber()+"Numaralı Hesap için kredi başvurunuz yoktur.");
		}
	}

	public void basvuruReddet(Account account) {
		if (account.isKrediBasvurusu()) {
			System.out.println("Kredi başvurunuz red olmuştur.");
			
			account.setIstenenKrediMiktari(0);
			account.setKrediBasvurusu(false);
		}else {
			System.out.println(account.getaccountNumber()+"Numaralı Hesap için kredi başvurunuz yoktur.");
		}
	}

	
	public void basvuruOnayla(User user) {
		if (user.getAccount().isKrediBasvurusu()) {
			System.out.println("Kredi başvurunuz onaylanmıştır.");
			user.getAccount().setMoney(user.getAccount().getMoney()+user.getAccount().getIstenenKrediMiktari());
			user.getAccount().setIstenenKrediMiktari(0);
			user.getAccount().setKrediBasvurusu(false);
		}else {
			System.out.println(user.getAccount().getaccountNumber()+"Numaralı Hesap için kredi başvurunuz yoktur.");
		}
	}

}

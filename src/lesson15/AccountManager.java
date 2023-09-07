package lesson15;

public class AccountManager {
	
	
	public void paraYatir(Account account,double money) {
		if (money <= 10000) {
			account.setMoney(account.getMoney() + money);
			System.out.println("Yatırılan para miktarı: " + money
					+ " Güncel Bakiyeniz: " + account.getMoney());
		} else {
			System.out.println("10.000 TL üzerinde yatırım yapamazsınız.");

		}
	}

	public void paraCek(Account account,double money) {
		if (money <= 5000 && money <= account.getMoney()) {
			account.setMoney(account.getMoney() - money);
			System.out.println(
					"Çekilen para miktarı: " + money + " Güncel Bakiyeniz: " + account.getMoney());
		} else if (money > 5000) {
			System.out.println("5.000 TL üzerinde günlük çekim işlemi yapamazsınız");
		} else {
			System.out.println("Hesap Bakiyeniz BU İŞLEM İÇİN YETERSİZDİR.");
		}
	}
public void hesapBilgileriYazdir(Account account) {
	System.out.println("Hesap No: "+account.getaccountNumber()+"\tGüncel Bakiye: "+account.getMoney());
}

}

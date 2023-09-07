package lesson15;

import java.util.Random;

import lesson14_05_09_2023.product.utility.RandomGenerateId;

public class Account {



	private String accountNumber;
	private double money;
	private boolean krediBasvurusu;
	private double istenenKrediMiktari;
	
	
	
	
	

	public double getIstenenKrediMiktari() {
		return istenenKrediMiktari;
	}

	public void setIstenenKrediMiktari(double istenenKrediMiktari) {
		this.istenenKrediMiktari = istenenKrediMiktari;
	}

	public Account( double money) {

		this.accountNumber = RandomGenerateAccountNo();
		this.money = money;
	}

	public boolean isKrediBasvurusu() {
		return krediBasvurusu;
	}

	public void setKrediBasvurusu(boolean krediBasvurusu) {
		this.krediBasvurusu = krediBasvurusu;
	}

	public String getaccountNumber() {
		return accountNumber;
	}

	public void setaccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;

	}

	private String RandomGenerateAccountNo() {
		Random random = new Random(); // Random Sınıfı Oluşturduk.
		int id = random.nextInt(1000, 10000);// RANDOM GELECEK SAYI 1000-10000 ARASINDA OLSUN DEDİK.
		String randomId = Integer.toString(id);// İnt olarak gelen random ıd yi stringe çevirdik.
		return randomId;
	}

	public void paraYatir(double money) {
		if (money <= 10000) {
			setMoney(getMoney() + money);
			System.out.println("Yatırılan para miktarı: " + money
					+ " Güncel Bakiyeniz: " + getMoney());
		} else {
			System.out.println("10.000 TL üzerinde yatırım yapamazsınız.");

		}
	}

	public void paraCek(double money) {
		if (money <= 5000 && money <= getMoney()) {
			setMoney(getMoney() - money);
			System.out.println(
					"Çekilen para miktarı: " + money + " Güncel Bakiyeniz: " + getMoney());
		} else if (money > 5000) {
			System.out.println("5.000 TL üzerinde günlük çekim işlemi yapamazsınız");
		} else {
			System.out.println("Hesap Bakiyeniz BU İŞLEM İÇİN YETERSİZDİR.");
		}
	}

}

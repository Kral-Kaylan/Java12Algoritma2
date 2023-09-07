package Lesson12_OOP;

public class BankAcount {

	/*
	 * bir interestrate accountnumber bide balance özelliklerimiz var
	 * bu sınıfı soyutladıktan sonra bankamız için bir faiz oranı belirliyoruz
	 * 0.05
	 * daha sonra faiz getirisini hesaplayan bir metot yazalım
	 * birde getInformation metodu yazalım hesap bilgilerini göstersin
	 * 
	 */
	
	
static final	double INTEREST_RATE =0.05;
	double balance;
	String accountNumber;
	
	
	public double  faizGetirisi(int gun) {
		double gunlukFaizGetirisi=(balance/100)*(INTEREST_RATE/365)*gun;
		return gunlukFaizGetirisi;
	}
	public void getInformation() {
		System.out.println("===Hesap Bilgileri");
		System.out.println("Hesap Numarası: "+accountNumber);
		System.out.println("Hesap Bakiyesi: "+balance);
		System.out.println("Faiz Oranı: "+faizGetirisi(1));
	}
	
	
	
	
}

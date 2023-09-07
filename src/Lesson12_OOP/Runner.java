package Lesson12_OOP;

import java.util.UUID;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAcount account1= new BankAcount();
		account1.accountNumber=UUID.randomUUID().toString(); // rANDOM BİR STRİNG DEĞERİ GETİRİR
		account1.balance=100000;

		
		BankAcount account2= new BankAcount();
		account2.accountNumber=UUID.randomUUID().toString(); // rANDOM BİR STRİNG DEĞERİ GETİRİR
		account2.balance=500000;
	
		
		account1.getInformation();
		account2.getInformation();
		
		System.out.println(account1.faizGetirisi(30));

		
		
		
		
	}

}

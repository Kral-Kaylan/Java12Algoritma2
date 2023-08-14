package lesson001;

import java.util.Scanner;

public class Question2 {

	
	public static void main(String[] args ){
		
		
		Scanner scanner =new Scanner(System.in);
		
		int sayi1;
		int sayi2;
		double sonuc;
		System.out.println("Sayı Giriniz: ");
	
	sayi1= scanner.nextInt();
	
	System.out.println("Sayı Giriniz: ");
	sayi2= scanner.nextInt();
	
	sonuc= sayi1*sayi2;
	
	System.out.println("Girilen iki sayınin çarpım değeri="+" "+sonuc);
	
	
	}
}

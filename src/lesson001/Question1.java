package lesson001;

import java.util.Scanner;

public class Question1 {
	
	public static void main(String[] args ) {
		
		// Verilen isim ve soyisim verilerini " Hoş geldiniz isim+soyisim olacak sekilde yazdıralım
		
		
		Scanner scanner=new Scanner(System.in);
		String isim;
		String soyisim;
		System.out.println("İsminizi Giriniz");
		
		isim=scanner.next();
		
		System.out.println("Soyisminizi Giriniz");
		
		soyisim=scanner.next();
		
		System.out.println("Hoş Geldiniz: "+isim+" "+soyisim);
		
		
	}
	

}
package lesson009;

import java.util.Scanner;

public class Question52 {

	public static void main(String[] args) {
		
// parametre olarak girilen isim ve soyisim değerini ekrana yazdıralım.
		
		// Kullanıcının ismini farklı bit metotda, soyismini farklı bir metotda, farklı bir metotda da
		// kullanıcının bilgilerini yazdıralım.
		
	String nameString=name();
	String surNameString=  surname();
	adSoyAdYazdırma(nameString, surNameString);
		
	
	
	}

	public static void adSoyAdYazdırma(String name, String surName) {
		
		System.out.println("İsminiz: "+name+" Soyisim : "+surName);
		
}
	

	
	
	public static String name() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("İsminizi Giriniz");
		String name=scanner.next();
		return name;
	}
	public static String surname() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Soy İsminizi Giriniz");
		String surname=scanner.next();
		return surname;
	}

}
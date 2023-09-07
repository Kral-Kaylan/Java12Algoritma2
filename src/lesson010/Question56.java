package lesson010;

import java.util.Scanner;

public class Question56 {

	public static void main(String[] args) {

// Doğum yılını girerek yaşı ve hangi yy doğduğunu metotlarla yazalım
		// kullanıcıBilgileriniGoster() metodunu çağırdığımda
		// hem yy hem de yaşımızı söyleyecek. 

	kullanıcıBilgileriniGoster();
	
	
	
	
	
	
	}

	public static int yasHesapla (int sayi) {
		int yas=2023-sayi;
		return yas;
	}
	public static int yuzYilBul(int dogumYılı) {
		int yuzYil=(dogumYılı/100)+1;
		return yuzYil;
	}
	
	public static void kullanıcıBilgileriniGoster() {
		Scanner scanner=new Scanner(System.in); 
		
		System.out.println("Doğum Yılınızı Giriniz");
		
		int yil=scanner.nextInt();scanner.nextLine();
		int yas=yasHesapla(yil);
		int yuzYil= yuzYilBul(yil);
		System.out.println("Yaşınız--> "+yas+" "+yuzYil+".yüzyılda doğdunuz");
	}
	
	
	
	
	
	
	
	
	
}

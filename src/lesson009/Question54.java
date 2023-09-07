package lesson009;

import java.util.Scanner;

public class Question54 {

	public static void main(String[] args) {
		// Parametre olarak int alan ve int döndüren bit betot yazalım
		// girilen sayının kaç basamaklı olduğunu bulalım
	
		
		
		Scanner scanner=new Scanner(System.in);   // BUNLARI METOT OLARAK YAZMAYI DENE . DERS KAYDI 02.40 
		
		System.out.println("Sayıyı giriniz: ");
		int x=scanner.nextInt();
		
		int kacBasamak=basamakSayisiBulma(x);
		
		System.out.println(x+" Sayısı "+kacBasamak+" basamaklıdır");
	}
	
	public static int basamakSayisiBulma(int x) {
		String basamak=String.valueOf(x);
		int basamakSayisi=basamak.length();
		return basamakSayisi;
		
		
		}
	
	
//	  
//    //Parametre olarak int alan ve int döndüren metot yazalım
//		//girilen sayının kaç basamakl ıoldugunu bulalım
//		
//		//hesapla(int sayi)
//		
//		//girilen --> 10000 --> Stringe çeviriyim
//		//100000 length aliyim 
//		
//		int sayi = sayiAl();
//		
//		int kacBasamak = basamakBul(sayi);
//		
//		basamakSayisiniGoster(sayi, kacBasamak);
//		
//	}
//	
//	public static int basamakBul(int sayi) {
//		String basamak = String.valueOf(sayi);
//		int basamakSayisi = basamak.length();
//		return basamakSayisi;
//	}
//	
//	public static int sayiAl() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Sayi girin: ");
//		int sayi = scanner.nextInt();
//		return sayi;
//	}
//	
//	public static void basamakSayisiniGoster(int sayi, int basamakSayisi) {
//		System.out.println(sayi + " Sayisi " + basamakSayisi +" Basamaklıdır");
//	}
//	
	
	
	
	
	
	}



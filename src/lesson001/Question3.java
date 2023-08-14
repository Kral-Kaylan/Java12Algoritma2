package lesson001;

import java.util.Scanner;

public class Question3 {
	
	public static void main(String[] args ) {
		
		
		/*
		 * Verilen satış fiyatında %18 kdv ve %15 kar payı olan ürünün ham fiyatını bulan program
		 */
		Scanner scanner=new Scanner(System.in);
		
		double vergioranı=1.8;
		double kdv=1.5;
		double satısFiyatı;
		double hamFiyat;
		
		System.out.println("Ürünün Satış Fiyatını Giriniz: ");
		  satısFiyatı=scanner.nextDouble();
	      
		  hamFiyat=satısFiyatı/(vergioranı*kdv);
		  
		System.out.println("Ürünün ham fiyatı= :"+" "+hamFiyat);
		
	      
		
	}


	
}

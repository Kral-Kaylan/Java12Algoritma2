package lesson002;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		
		// Girilen tl değerini dolar kuruna çeviren program
		
		
		Scanner scanner=new Scanner(System.in);
		double paramiktar,sonuc;
		double dolarkuru;
		System.out.println("Para miktarını Giriniz ");
		paramiktar=scanner.nextDouble();
		System.out.println("Dolar kurunu Giriniz ");
		dolarkuru=scanner.nextDouble();
		sonuc= paramiktar/dolarkuru;
		System.out.println("Para miktarınızın dolar kuru karşılığı= "+sonuc);
	}

}

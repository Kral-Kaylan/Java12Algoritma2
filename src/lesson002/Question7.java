package lesson002;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
	  
		// Girilen Sayının tek mi Çift mi olduğunu Yazdıran Program
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("sayı giriniz");
		int sayi=scanner.nextInt();
		if (sayi%2==0) {
			System.out.println("Girilen sayı Çifttir");
			
		}else {
			System.out.println("Girilen sayı tektir");
		}
		
		

	}

}

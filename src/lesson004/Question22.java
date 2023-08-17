package lesson004;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		
		// Girilen sayının asal polup olmadığını bulan Prog
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Sayı giriniz");
		int sayi=scanner.nextInt();

		for (int i = 2; i <=sayi; i++) {
			
			sayi=sayi%i;
			if (sayi==0) {
				System.out.println("Asal Değil");
				
			}else {
				System.out.println("Asal ");
			}
			
			
		}

	}

}

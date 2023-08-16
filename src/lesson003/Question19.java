package lesson003;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		// Girilen sayının 5 in kuvveti olup olmadığını bulan prog.
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Sayı giriniz");
		int sayi=scanner.nextInt();
	   boolean kontrol=true;
	   
	   while (kontrol==true) {
		if (sayi%5==0) {
			sayi=sayi/5;
		}if (sayi==1) {
			System.out.println("5'in kuvvetidir");
		kontrol=false;
		
		
		}else {
			System.out.println("5'in kuvveti değildir");
		
		kontrol=false;
		
		}
	}

	}

}

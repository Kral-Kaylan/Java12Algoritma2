package lesson002;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// GİRİLEN 3 SAYIDAN EN BÜYÜĞÜNÜ YAZDIRAN PROG.
		Scanner scanner=new Scanner(System.in);
		System.out.println("1.sayıyı Giriniz");
		int sayi1=scanner.nextInt();
		System.out.println("2.sayıyı Giriniz");
		int sayi2=scanner.nextInt();
		System.out.println("3.sayıyı Giriniz");
		int sayi3=scanner.nextInt();
		if (sayi1>sayi2 &&sayi1>sayi3) {
			System.out.println("En büyük sayı= "+sayi1);
			
		}else if (sayi2>sayi1 && sayi2>sayi3) {
			System.out.println("En büyük sayı= "+sayi2);
		}else {
			System.out.println("En büyük sayı= "+sayi3);
		}
		
	}

}

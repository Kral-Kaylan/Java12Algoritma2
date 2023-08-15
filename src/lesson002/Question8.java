package lesson002;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// Kenar uzunlukları girilen üçgenin çeşitini söyleyen prog.
		// && ve || mantığını iyice öğren
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("kenar uzunluğu girin");
		double kenar1=scanner.nextDouble();
		System.out.println("kenar uzunluğu girin");
		double kenar2=scanner.nextDouble();
		System.out.println("kenar uzunluğu girin");
		double kenar3=scanner.nextDouble();
		if (kenar1==kenar2 && kenar1==kenar3) {
			System.out.println("Eş kenar");
		
		}else if (kenar1==kenar2 &&kenar1!=kenar3) {
			System.out.println("İkiz kenar");
			
		}else if (kenar1==kenar3 &&kenar2!=kenar3) {
			System.out.println("İkiz kenar");
			
		}
		
		else {
			System.out.println("çeşit kenar");
			
		}
	}

}

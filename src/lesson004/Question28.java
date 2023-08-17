package lesson004;

import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {
		// Basit HesapMakinesi

		Scanner scanner=new Scanner(System.in);
		System.out.println("Toplam için 1 "+"Çıkarma için 2 "+"bölme için 3 "+"Çarpma için 4  basın");
		int y=scanner.nextInt();
		switch (y) {
		case 1:
			double x,k;
			System.out.println("Sayı Giriniz");
			 x=scanner.nextInt();
			 System.out.println("Sayı Giriniz");
			 k=scanner.nextInt();
				double toplam=x+k;
			 System.out.println(toplam);
			 
			 break;
			 
		case 2:
			System.out.println("Sayı Giriniz");
			 x=scanner.nextInt();
			 System.out.println("Sayı Giriniz");
			 k=scanner.nextInt();
				double cıkarma=x-k;
			 System.out.println(cıkarma);
break;
		
		case 3:
			System.out.println("Sayı Giriniz");
			 x=scanner.nextInt();
			 System.out.println("Sayı Giriniz");
			 k=scanner.nextInt();
			 double bolme=x/k;
			 System.out.println(bolme);
break;

		case 4:

			System.out.println("Sayı Giriniz");
			 x=scanner.nextInt();
			 System.out.println("Sayı Giriniz");
			 k=scanner.nextInt();
				double carpma=x*k;
			 System.out.println(carpma);
break;


		default:
			break;
		}
		
		
		
		
	}

}

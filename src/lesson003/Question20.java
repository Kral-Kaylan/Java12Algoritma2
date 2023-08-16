package lesson003;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		//  girilen sayıya kadaar tek olan sayıların top. yaz
		Scanner scanner=new Scanner(System.in);
		int toplam=0;
		System.out.println("Sayı giriniz");
		int sayi=scanner.nextInt();
		while (sayi!=0) {
			if (sayi%2==0) {
				 toplam +=sayi;
			}
			sayi--;
		}
		
		System.out.println("toplam = "+toplam);
		
		
		
		
		
		
	}

}

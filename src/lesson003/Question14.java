package lesson003;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   // Girilen 3 sayıdan en büyüğünü yaz.
		
		int sayi,enBuyuk=0,sayac=1;
		while (sayac<=3) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Sayı Giriniz ");
			sayi=scanner.nextInt();
			sayac++;
			if (sayi>=enBuyuk) {
				enBuyuk=sayi;
			
			}
			
			
		}System.out.println("Girilen Sayıların en büyüğü = "+enBuyuk);
	}

}

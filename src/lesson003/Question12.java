package lesson003;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Girilen iki sayının toplamı çift ise true tek ise false yaz.
		// string boolean olarak yaz.
		// toplanan 2 sayıyıda göster
		
		Scanner scanner=new Scanner(System.in);
		boolean ciftMi;
		System.out.println("Sayı Giriniz: ");
		int sayi1=scanner.nextInt();
		System.out.println("Sayı Giriniz ");
		int sayi2=scanner.nextInt();
		int toplam=sayi1+sayi2;
		if (toplam%sayi2==0) {
			ciftMi= true;
			
		}else {
			ciftMi= false;
		}System.out.println("1.sayi = "+sayi1+"2.sayı= "+sayi2+ciftMi);
	}

}

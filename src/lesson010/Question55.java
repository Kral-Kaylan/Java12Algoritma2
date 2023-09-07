package lesson010;

import java.util.Scanner;

public class Question55 {

	public static void main(String[] args) {
		// 1-100 kadar olan sayıların asal olanlarını bulucağız

	asallariGoster();
	
	
	
	
		}

	
	public static boolean asalKontrol(int sayi) {
		Boolean asalMı=true;
		if (sayi<2) {
			asalMı=false;
		}else {
			for (int i = 2; i <sayi; i++) {
				if (sayi%i==0) {
					asalMı=false;
					break;
				}
			}
		}
			return asalMı;
	}
				
public static void asallariGoster() {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Sayı Giriniz: ");
	int sayi=scanner.nextInt(); scanner.nextLine();
	for (int i = 1; i < sayi; i++) {
		boolean asalMı=asalKontrol(i);
		if (asalMı) {
			System.out.println(i+" ");
		}
	}
}

}

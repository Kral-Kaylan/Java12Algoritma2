package lesson009;

import java.util.Scanner;

public class Question53 {

	public static void main(String[] args) {
	
		int toplamSonuc=topla();
		boolean check= kosul(toplamSonuc);
	
		
        indirimHesapla(check);
	}

	
	
	private static int topla() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("1. sayıyı giriniz: ");
		int x=scanner.nextInt();
		
		System.out.println("2. sayıyı giriniz: ");
		int y=scanner.nextInt();
		return x+y;
	}
	public static boolean kosul(int sum) {
		if (sum>10) {
			return true;
		}else {
			return false;
		}
		
	}
	public static void indirimHesapla(boolean kontrol ) {
		System.out.println(kontrol? "İndirim Kazandınız":"indirim yok");
	}
	
	
}

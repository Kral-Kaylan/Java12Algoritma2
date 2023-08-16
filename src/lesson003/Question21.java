package lesson003;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Sayı giriniz");
		int sayi=scanner.nextInt();
		int basamakSayisi=1,basamak;
		
		while (sayi!=0) {
			basamak=sayi%10;
			sayi=sayi/10;
			System.out.println(basamakSayisi+"ler basamağı "+basamak);
		basamakSayisi=basamakSayisi*10;
		
	}
	}

}

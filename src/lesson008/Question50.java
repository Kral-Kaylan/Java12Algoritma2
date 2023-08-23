package lesson008;

import java.util.Iterator;

public class Question50 {

	public static void main(String[] args) {
		// Dizide 13 var ise hem 13 ü hemde sonra gelen elemanı toplama dahil etmeden dizinin top. bul
		
		int sayilar[] = { 1, 13, 13, 13, 2, 5, 13, 1 };
		int toplam=0;
		
		for (int i = 0; i < sayilar.length; i++) {
		if (sayilar[i]==13 ||(i>0 &&sayilar[i-1]==13)) {
			continue;
		}	else {
			toplam+=sayilar[i];
		}
		}
		System.out.println(toplam);
		
		
		

	}

}

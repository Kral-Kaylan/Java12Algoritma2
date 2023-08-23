package lesson007;

import java.util.Arrays;

public class Question40 {

	public static void main(String[] args) {
		
		// Dizideki negatif sayıları bulan ve bu sayılar ile yeni bir dizi oluş. Prog
		
		int[] sayilar = { 0, 120, -5, -85, -256, 16, 1258, 81, 14 };
	int negatifSayi=0;
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i]<0) {
				negatifSayi++;
			}
		}
	int [] negatifSayilar=new int [negatifSayi]; // yeni dizinin eleman sayısını atama yaptık.
		
		int index=0; // 0 dan başlamasının nedeni yeni dizinin indis değerinin 0 dan başlaması ve doğru atama yapabilme
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i]<0) {
				negatifSayilar[index]=sayilar[i];
				index++;
			}
		}
		
		System.out.println(Arrays.toString(negatifSayilar));
		
		
	}

}

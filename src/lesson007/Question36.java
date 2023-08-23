package lesson007;

import java.util.Arrays;

public class Question36 {

	public static void main(String[] args) {

		// İçnde 5 tane ülke bulunan bir dizi oluşturalım
		// a ile biten ülkelerin yerine ? koysun
		
		String [] dizi= {"Almanya","Belçika","Türkiye","Fransa"};
		
		String Index="";
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i].endsWith("a")) {
				dizi[i]="?";
				System.out.println(i+". -index değişti");
			}
		}
		
		System.out.println("Güncel array "+Arrays.toString(dizi));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

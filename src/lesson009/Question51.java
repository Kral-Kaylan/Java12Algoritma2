package lesson009;

import java.util.Scanner;

public class Question51 {

	public static void main(String[] args) {

		
		Scanner scanner=new Scanner(System.in);
		
		String[] ingilizceKarakter = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };

		String[] turkceKarakter = { "İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö" };
		// Kullanıcıdan bir tane kelime alıcağız.
		// kelimedeki türkçe karakterleri ingilizce karakterlerle değiştiricez.
		
		System.out.println("Kelime Giriniz: ");
		String kelime= scanner.next();
		
		for (int i = 0; i < turkceKarakter.length; i++) {
			if (kelime.contains(turkceKarakter[i])) {   // Kelimedeki türkçe karakterleri buluyor.
				kelime=kelime.replaceAll(turkceKarakter[i], ingilizceKarakter[i]);// Kelimedeki türkçe karakterlerle ingilizce karakterleri değişyiriyor.
			}
			
		}
    System.out.println(kelime);
	}

	
	public static String changeTrToEng(String translate) {
		translate.charAt('a');
		return null;
	}
	
//	
//	 String[] ingilizceKarakter = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };
//		
//		String[] turkceKarakter    = { "İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö" };
//
//		
//		//kullanıcıdan bitane kelime alcaz
//		//burdaki türkçe karekterleri ingilzce karkterler ile değiştircez
//		
//		//Şeydağğ
//		
//		//Seydagg
//		
//		//replace and replaceALl farkı
//		
//		//String bir ifade alsın
//		//String bir değer döndürsün.
//		
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Kelime girin");
//		String kelime = scanner.next();
//		
//		System.out.println(changeTrToEng(kelime, turkceKarakter, ingilizceKarakter)); 
//		
//		
//	}
//	public static String changeTrToEng(String kelime, String[] array1, String[] array2 ) {
//		for (int i = 0; i < array1.length; i++) {
//			if(kelime.contains(array1[i])) {
//				kelime = kelime.replaceAll(array1[i], array2[i]);
//			}
//		}
//		return kelime;
//	}
// 
	
	
	
	
	
	
	
	
}

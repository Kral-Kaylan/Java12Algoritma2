package lesson010;

import java.util.Scanner;

public class Question58 {

	public static void main(String[] args) {
		// Girilen kelimenin ilk ve son harfini değiştirelim
		// girilen kelime 0-100 arasında olması lazım
		// tek harfli girilirse harfi return etsin
        // firma case sorusu
		
		System.out.println(swapString("bilgeadam"));
		
		System.out.println(swapString("a"));
		
		
		
		
		
	}
public static String swapString(String kelime) {
	if (kelime.length()<2) {
		return kelime;
	}
	if (kelime.length()>100 || kelime.length()<0) {
		System.out.println("Hata");
	}
	StringBuilder builder= new StringBuilder(kelime);
	char ilkHarf=kelime.charAt(0);
	char sonHarf=kelime.charAt(kelime.length()-1);
	builder.setCharAt(0, sonHarf);
	builder.setCharAt(kelime.length()-1, ilkHarf);
	
	
	return builder.toString();
	
	
}
	
	
	
	
	
}

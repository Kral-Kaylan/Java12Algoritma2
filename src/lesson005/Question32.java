package lesson005;

import java.util.Scanner;

public class Question32 {

	public static void main(String[] args) {
		// Girilen kelimenin içinde kaçtane 'e' hafri olduğunu bulan program.
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Kelime giriniz");
		String kelime=scanner.next();
		int toplam=0;
		for (int i = 0; i < kelime.length(); i++) {
			if (kelime.charAt(i)=='e') {
				toplam+=1;
				
			}
			
			
		}
		System.out.println(toplam+" Tane e harfi vardır.");

	}

}

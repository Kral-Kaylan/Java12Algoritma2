package lesson005;

import java.util.Scanner;

public class Question29 {

	public static void main(String[] args) {
		// Girilen kelimenin harflerini alt alta yazdıran Prog.
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Kelime giriniz");
		String kelime=scanner.next();
		int sonIndex=kelime.length()-1;
		;
		
		
		for (int  ilkIndex=0; ilkIndex<= sonIndex ; ilkIndex++)
		{
			System.out.println(kelime.charAt(ilkIndex));
		}
		
		
		
		
		
		
		
		

	}

}

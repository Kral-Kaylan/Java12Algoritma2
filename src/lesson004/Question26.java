package lesson004;

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		// kullanıcıdan taban ve üs alıp sonucu hesaplıyacak
		
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("a üzeri b gibi bir hesaplama için a değerini yazınız:");
		int a=scanner.nextInt();
		
		System.out.println("a üzeri b gibi bir hesaplama için b değerini yazınız:");
		int b=scanner.nextInt();
		
		
		//işlem: b kere a'yı kendisi ile çarpacağız
		int carpim=1;
		for (int i=1; i<=b; i++)
			carpim=carpim*a;
		
		System.out.println("a üzeri b="+carpim);
		
		
		
		
		
		

	}

}

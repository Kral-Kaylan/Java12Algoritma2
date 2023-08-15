package lesson002;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// Verilen iki sayıdan hangisinin büyük olduğunu yazdıran program
		
		Scanner scanner=new Scanner(System.in);
		
		int sayi1, sayi2;
		System.out.println("SayıGiriniz ");
		sayi1=scanner.nextInt();
		System.out.println("SayıGiriniz ");
		sayi2=scanner.nextInt();
		if (sayi1>sayi2) {
			System.out.println("sayi küçüktür "+ sayi2);
		
			}else if (sayi1==sayi2) {
				System.out.println("sayılar eşittir ");
				
			}else {
				System.out.println("Küçük sayı = "+ sayi1);
			}
			
		}
	
	
	
	
	}



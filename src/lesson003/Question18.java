package lesson003;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		
		
		// Girilen sayının basamaklarının top.
		
		
		
		Scanner scanner=new Scanner(System.in);
		int	toplam=0 ;
		System.out.println("Sayı Giriniz");
int sayi=scanner.nextInt();
while (sayi!=0) {
	toplam+=sayi%10;
	sayi=sayi/10;
} 

System.out.println("Toplam= "+toplam);
	}

}

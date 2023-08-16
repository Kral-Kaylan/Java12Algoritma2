package lesson003;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		// Kullanıcıdan 1-7 arası sayı alalım günün hafta içi mi dışı mı olduğunu söylesin
		Scanner scanner=new Scanner(System.in);
		System.out.println("Sayı giriniz");
int sayi=scanner.nextInt();
switch (sayi) {
case 1,2,3,4,5:
	System.out.println("Haftaiçi");
	break;
case 6,7:
	System.out.println("Haftasonu");
default:
	
	break;
}
	}

}

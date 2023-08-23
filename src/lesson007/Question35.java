package lesson007;

import java.util.Random;
import java.util.Scanner;

public class Question35 {

	public static void main(String[] args) {
	
		// Sayı tahmin uygulaması: sürekli sayı tahmini alcaz
		// tahmine göre yönlendirme yapacaz
		// bildiğinde kaçıncı cevabında bildiğini gösterecez
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println(" ====Sayı Tahmin OYUNU====");
		
		Random rnd=new Random();
		int cevap=rnd.nextInt(1,20);
		int index=0, hak=6;
		for (int i = 1; ; i++) {
			hak--;
			if (hak==0) {
				System.out.println("Üzgünüz Tahmin Hakkınız Doldu");
				break;
			}
			System.out.println("Sayı Tahmininizi Giriniz");
			int sayi=scanner.nextInt();
			
			if (sayi==cevap) {
				index+=i;
				System.out.println("Tebrikler Tahmininiz Doğru "+index+". adımda buldunuz");
				break;
			}else if (sayi<cevap) {
				System.out.println("Tahmininizi Yükseltin");
			}else {
				System.out.println("Tahmininizi Düşürün");
			}
			
		}
		
		
		
		
		
		
		
		
		

	}

}

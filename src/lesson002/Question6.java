package lesson002;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
		
		// kullanıcıdan alınanvize ve final notlarını hesaplayarak
		//geçip geçmediğini gösteren progrem
		//vize%40 , final%60 50 den büyük geçer küçük kalır
		
		Scanner scanner=new Scanner(System.in);
		int vize,Final;
		double sonuc;
		System.out.println("vize notunuzu girin");
		vize= scanner.nextInt();
		
		System.out.println("Final notunuzu girin");
		Final= scanner.nextInt();
		if (vize<0 ||Final<0 ||vize>100 || Final>100) {
			System.out.println("Doğru değer girin");
		}else {
			sonuc=(vize*0.4)+(Final*0.6);
			if (sonuc<50) {
				System.out.println("Kaldınız "+sonuc);
			}else {
				System.out.println("Geçtiniz "+sonuc);
			}
			
		}
	

	}

}

package lesson11_MustafaHoca;

import java.util.Random;
import java.util.Scanner;

public class tasKagitMakasOyunu {

	/*
	 * [ tas,kagit,makas]
	 * 
	 * pc sevim yapsın random bir index üretip arrayden bir tane veri ceksin
	 * secimYap() metodunu yazacağız önce arrayimizi yazdıralım kullanıcı neyi sececeğini görsün
	 * 1-Taş
	 * 2-Kağıt
	 * 3- Makas
	 * Daha sonra burdan biir secim yapsın ve metot bize bu secimi geri dönsün.
	 */
    static Scanner scanner=new Scanner(System.in);
	static String[] secenekler = { "TAŞ", "KAĞIT", "MAKAS" };

	public static String psSecim() {
		Random rnd = new Random();
		int index = rnd.nextInt(secenekler.length);

		return secenekler[index];
	}
public static String secimYap() {
	
	for (int i = 0; i < secenekler.length; i++) {
		System.out.println((i+1)+"-"+secenekler[i]);
		
		}
//	System.out.println("Lütfen bir seçim yapınız...");
//	  int secim=scanner.nextInt();
//	  
	
	
	int secim=secimKontrol();
	return secenekler[secim-1];
	
	
	} public static int secimKontrol() {
		int secim=0;
	for (int i = 0; ; i++) {
		System.out.println("Lütfen 1-3 arası bir seçim yapınız...");
		secim=scanner.nextInt();
		if (secim<4 && secim>0) {
			int answer=secim;
			break;
		}
	}
	
	return secim;
	}

	public static void oyun() {
		/*
		 * 1- pc secim yapacak
		 * 2- kullanıcı secim yapacak
		 * 3-bu iki secimi kontrol edeceğiz.kazanma kayıp ve beraberlik sonucu yazdırılacak
		 */
	String pcSecim=	psSecim();
	String secimimString=secimYap();
	
	System.out.println("PC SECİMİ: "+pcSecim);
	System.out.println("SEÇİMİNİZ: "+secimimString);
		if (pcSecim.equals(secimimString)) {
			System.out.println("Beraberlik");
		}else {
			
			switch (secimimString) {
			case "TAŞ": 
				if (pcSecim.equals("KAĞIT")) {
					System.out.println("KAYBETTİNİZ");
				}else {
					System.out.println("KAZANDINIZ");
				}
				break;
			case "KAĞIT":
				if (pcSecim.equals("MAKAS")) {
					System.out.println("KAYBETTİNİZ");
				}else {
					System.out.println("KAZANDINIZ");
				}
				break;
				
				case "MAKAS":
					if (pcSecim.equals("TAŞ")) {
						System.out.println("KAYBETTİNİZ");
					}else {
						System.out.println("KAZANDINIZ");
					}
					break;
					
			}
	
			
		}		
	}		
}	
			
		
		
		
		
		
		
		
		
		
	
		


package lesson004;


import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
		//  çalışmadı
		
		Scanner scanner=new Scanner(System.in);
		int enBuyuk=-1,enKucuk=101,sayi;
		
		for (int i = 1; i <=5; i++) {
			System.out.println(i+".Sayı Giriniz");
			 sayi=scanner.nextInt();
			 if (sayi<=0 || sayi >=100) {
				 System.out.println("0-100 arası değer giriniz");
				 i--;
				break;
			}else  {
				if (sayi<enKucuk) {
					enKucuk=sayi;
					
				} if (sayi>enBuyuk) {
					enBuyuk=sayi;
				}
		
					
				
			}
		
			
		}
		System.out.println(enBuyuk+" "+enKucuk);
	}

}

package lesson003;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//telefona ve maile bir kod gelicek bu kodları biz tanımlayacağız
		// KullanıcısN MAİLE VE TELEFONA GELEN KODU İSTEYECEĞİZ
		// TELEFONA VE MAİLE GELEN KOD UYUŞUYORSA
		//SİSTEME KAYIT OLDUNUZ DİYELİM
		//YA MAİLİ YA TELEFONU YADA HER İKİSİDE HATALIDIR
		//KULLANICIYA BİLGİ VERECEĞİZ
		
		int telefonKod=123, mailKod=456,kod1,kod2;
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("Telefon Kodunuzu Giriniz");
		kod1=scanner.nextInt();
		 System.out.println("Mail Kodunuzu Giriniz");
		 kod2=scanner.nextInt();
		 if (mailKod==kod2 && telefonKod==kod1) {
			System.out.println("Sisteme Kayıt Başarılı");
		}else if (mailKod!=kod2&& telefonKod==kod1) {
			System.out.println("Mail kodunuz hatalıdır");
		}else if (mailKod==kod2 && telefonKod!=kod1) {
			System.out.println("Telefon  kodunuz hatalıdır");
		}else {
			System.out.println("Her iki   kodunuz hatalıdır");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

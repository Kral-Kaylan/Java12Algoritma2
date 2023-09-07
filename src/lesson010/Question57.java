package lesson010;

import java.util.Scanner;

public class Question57 {

	public static void main(String[] args) {
		// register() methodu
		// email şifre ile login olcak
		//e mail-->@hotmail.com ve @gmail.com uzantısı kabul etsin
		// password ve repassword aynı ise
		// e mail ve şifrenin doğru olması lazım
		// emailcheck ve passwordcheck
		// çıktı verelim

		register();
		
		// menü diye bir metot yazalım
		// register --> her şey okeyse true dönsün
		//yanlışsa false dönsün
		// sisteme hoş geldiniz yazsın
		
		// kullanıcıdan verileri almak için  2 farklı metot yazalım
		// register methodu sadece kayıt için çalışsın
		// register methodunda sürekli veri almıyoruz
		// sadece doğruysa giriiş yapsın
		
		
		
		
	}

	 public static boolean emailCheck(String email) {
			boolean check;
			String format1 = "@hotmail.com";
			String format2 = "@gmail.com";

			if (email.contains(format1) || email.contains(format2)) {
				check = true;
				System.out.println("email doğru formatte");
			} else {
				check = false;
				System.out.println("email hatalı");
			}
			return check;
		}

		public static boolean passwordCheck(String password, String rePassword) {
			boolean sifreKontrol = false;
			if (!password.equals(rePassword)) {
				System.out.println("Şifrele uyuşmuyor.");
			} else {
				sifreKontrol = true;
			}
			return sifreKontrol;
		}
	  
		 public static void register() {
				Scanner scanner = new Scanner(System.in);
				boolean check = true;
				boolean check2 = true;
				
				while(check) {
					System.out.println("Email Giriniz");
					String email = scanner.nextLine();
					boolean mailKontrol = emailCheck(email);
					if(!mailKontrol) {
						continue;
					}else {
						while(check2) {
							System.out.println("Şifrenizi girin ");
							String sifre1 = scanner.nextLine();
							
							System.out.println("Şifrenizi Tekrar Girin: ");
							String sifre2 = scanner.nextLine();
							boolean  sifreKontrol = passwordCheck(sifre1, sifre2);
							if(!sifreKontrol) {
								continue;
							}else {
								System.out.println("Kayıt Başarılı ");
								check = false;
								check2 = false;
							}
						}
					}
				}		
				}
}

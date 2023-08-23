package lesson006;

import java.util.Scanner;

public class Question34 {

	public static void main(String[] args) {

		// Girilen kelimede harf aratma ve aranılan harfin adedini, indisini gösteren
		// Prog.

		Scanner scanner = new Scanner(System.in);

		boolean kontrol = true;
		while (kontrol) {
			System.out.println("====String işlemleri====");
			System.out.println("1- Harf Saydırma");
			System.out.println("2- Harf Değiştirme");
			System.out.println("3- Polindrom Kontrol");
			System.out.println("4- Kelimenin harfleri arasına ? koydurma");
			System.out.println("5- Girilen kelimenin 3 harfinden donra ...");
			System.out.println("6- Girilen kelimenin 3 harfinden sonra diğer harf değerleri yerine '.' atan prog");
			System.out.println("0- Çıkış");

			int secim = scanner.nextInt();
			// scanner.nextLine();

			switch (secim) {
			case 1:
				int sayac = 0;
				String index = "";
				System.out.println("Kelime giriniz:");
				String kelime = scanner.next();

				System.out.println("Hangi harfi saymak istiyosunuz ");
				String harf = scanner.next();

				if (!kelime.contains(harf)) {
					System.out.println("Aradıgınız harf kelimede yoktur");
				} else {
					for (int i = 0; i < kelime.length(); i++) {
						if (kelime.charAt(i) == harf.charAt(0)) {
							sayac++;
							index += i + ",";
						}
					}
					// https://codeshare.io/bilge100
					System.out.println(harf + " harfi kelime içinde " + sayac + " adet bulunuyor");
					System.out.println(harf + " değerinin indexleri ==> " + index.substring(0, index.length() - 1));
				}
				break;

			case 2:
				System.out.println("Kelime giriniz:");
				String kelime0 = scanner.next();

				System.out.println("Hangi harfi değiştirmek istiyosunuz ");
				String harf0 = scanner.next();

				System.out.println("Hangi harf ile değiştirmek istiyosunuz ");
				String harf1 = scanner.next();
				if (!kelime0.contains(harf1)) {
					System.out.println("Harf Mevcut Değil" + harf0);
				} else {
					kelime0 = kelime0.replace(harf0, harf1);
				}

				System.out.println(kelime0);
				break;
			case 3:

				System.out.println("Kelime giriniz:");
				String kelime1 = scanner.next();
				String tersKelime = "";
				for (int i = 0; i < kelime1.length(); i++) {

					tersKelime = kelime1.charAt(i) + tersKelime;
				}

				if (kelime1.equals(tersKelime)) {
					System.out.println("Polindrom kelimedir");
				} else {
					System.out.println("Polindrom kelime değildir");
				}

				break;

			case 4:
				/*
				 * System.out.println("Kelime giriniz:"); String kelime2= scanner.next(); String
				 * sonuc=""; for (int j = 0; j < kelime2.length(); j++) {
				 * sonuc+=kelime2.charAt(j)+"?";
				 * 
				 * }
				 * 
				 * System.out.println(sonuc.substring(0,sonuc.length()-1)); // Not: sonda attığı
				 * ? çözümü
				 */

				StringBuilder stringBuilder = new StringBuilder();

				System.out.println("Kelime giriniz:");
				String kelime2 = scanner.next();
				for (int i = 0; i < kelime2.length(); i++) {
					stringBuilder.append(kelime2.charAt(i) + "?");
				}
				System.out.println(stringBuilder.substring(0, kelime2.length() - 1));

			case 5:
				System.out.println("Kelime giriniz:");
				String kelime3 = scanner.next();
				String yeniKelime = kelime3.substring(0, 3) + ".......";

				System.out.println(yeniKelime);

				break;
			case 6:
				System.out.println("Kelime giriniz:");
				String kelime4 = scanner.next();
				String yKelime = kelime4.substring(0, 3);
				for (int i = 3; i < kelime4.length(); i++) {
					kelime4 += ".";
				}
				System.out.println(kelime4);

			default:

				break;

			}

		}

	}
}

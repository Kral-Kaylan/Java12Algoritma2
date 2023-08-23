package lesson005;

public class Question30 {

	public static void main(String[] args) {

		String text = "Java,   Spring,   Postgre,   React"; // virgüller olmadan alt alta yazdırma amaç

		// for (int i = 0; i < text.split(",").length; i++) { // split komutunu
		// bilmedeğimiz için yoruma aldık.


		
		// }

		/*
		 * for (int i = 0; i < text.length(); i++) { 1. çözüm
		 * 
		 * if (text.charAt(i)==',') {
		 * 
		 * System.out.println(); continue; // ',' değerini okumadan atlamasını sağlıyor.
		 * 
		 * } System.out.print(text.charAt(i)); }
		 * 
		 * 
		 * .replaceAll() – regex ifadesi ile eşleşen tüm ifadelerin yerine yeni atanacak karakter veya kelimeyi yerleştirir.
.replace() – tüm eşleşen karakterlerin veya kelimelerin yerine yeni atanacak karakter veya kelimeyi yerleştirir.
.trim() – başlangıç ve bitişteki boşlukları siler.
		 * 
		 * 
		
		 *  Not: replaceAll("değişmesi istenen şey","Değişim ")
		 */
		int index = 0,i=0;
		for ( i = 0; i < text.length(); i++) {    // çıktı:Java
													 // Spring
			if (text.charAt(i) == ',') {             // Postgre -> react yazmadı çünkü ',' değeri yoktu
				System.out.print(text.substring(index, i)); //
				index = i + 1;
			}else if (text.charAt(i)==' ') {
				System.out.print(text.substring(index, i));
				index = i + 1;
				
			}

		}
		
		System.out.println(text.substring(index));
		
		
	/*	System.out.println("***************");
	String newText1=text.replaceAll(",", "");
	//System.out.print(newText1); 
String formatText1=newText1.replaceAll("\\s", "");

System.out.print(formatText1); */
	
	}

}

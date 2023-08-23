package lesson005;

import java.util.Scanner;

public class adadada {

	public static void main(String[] args) {
	

		/*String strWithSpaceTabNewline = " abc    defghi jkl\n\n\n" + "mno    ";
		String formattedStr01 = strWithSpaceTabNewline.replaceAll("\\s", " ");
		System.out.println( formattedStr01 );

		System.out.println( "*********************************");
		
				
				String formattedStr02 = strWithSpaceTabNewline.replaceAll("\\s","");
		System.out.println( formattedStr02 );*/
		
		Scanner scanner = new Scanner(System.in);
	
		  /*      String st1="aaaaaaaaaaaaa";
		        int i, adet=0;

		        for(i=0; i<=st1.length(); i++) {
		if (st1.charAt(i)=='a') {
			adet++;
		
		}else {
	        System.out.println("Girilen kelimede a harfi yoktur"); 
	        break;
		}
		      
		 
	
		}
		        System.out.println("Girilen kelimede toplam = "+adet+" a harfi var");   
		     */
		        
		        
		        System.out.println("Kelime giriniz:");
				String kelime1= scanner.next();    
				String sonuc="";
				for (int j = 0; j < kelime1.length(); j++) {
					sonuc=kelime1.charAt(j)+"?";
					 System.out.print(sonuc);
				}
		       
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
	}

}

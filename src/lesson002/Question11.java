package lesson002;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		// Dairenin alanı ve çevresini bulan Prog.
		
		Scanner scanner=new Scanner(System.in);
		 System.out.println("Yarı capı giriniz");
		 double ycap=scanner.nextDouble();
		 double pi=3.14;
		 double alan,cevre;
		  alan=pi*ycap*ycap;
		  cevre=2*pi*ycap;
		 
		 if (ycap<=0) {
			System.out.println("Lütfen pozitif bir sayı giriniz");
		}else {
			 System.out.println("Alan= "+alan+"\n"+"Çevre= "+cevre);
			  System.out.println();
			  
		}
		 
		 
		 
	}
}

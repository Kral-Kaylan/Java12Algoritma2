package lesson002;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		//  nota göre değer atam 
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ortalamanızı Giriniz");
		double ortalama= scanner.nextDouble();
		if (ortalama>90) {
			System.out.println("AA");
		}else if (ortalama>80 ) {
			System.out.println("BB");
		}else if (ortalama>70) {
			System.out.println("CC");

	}else if (ortalama>60 ) {
		System.out.println("DD");

}else {
	System.out.println("FF kaldınız= "+ortalama);
}
	}
}

	
package lesson008;

import java.util.Scanner;

public class Question42 {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		String[][] matris1 = { { "Bilge", "Advanced" }, { "Postgre", "Data" } };

		 

        String[][] matris2 = { { "Adam", "Java" }, { "SQL", "Base" } };
        
        // BilgeAdam gibi yazdıralım
        
        System.out.println(matris1[0][0]+matris2[0][0]);
		System.out.println(matris1[0][0].toUpperCase());
		System.out.println("***********************************************");

		// çıktı:
		
		//		BilgeAdam

		//		AdvancedJava

		//		PostgreSQL

		//		DataBase
	
		for (int i = 0; i < matris1.length; i++) {	

			for (int j = 0; j < matris2.length; j++) {
				System.out.println(matris1[i][j]+matris2[i][j]);
			}
		}
		
	
		
		
		
		

	}

}

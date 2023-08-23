package lesson008;

import java.util.Scanner;

public class Question44 {

	public static void main(String[] args) {
		// 2x2 matris oluşturacağız
		// kullanıcıdan isim değerleri alacağız
		
		
		// 1. Grup
		// ahmet
		// mehmet
		
		// 2. grup
		// ali
		// ayşe
		
		
		Scanner scanner=new Scanner(System.in);
		
		String [][] matris=new String[2][2];
		
		System.out.println("Oluşturmak İstediğiniz 2x2 Matris İçin Satır Değerleri Giriniz");
		
		for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.print("[" + i + "]" + "["+ j +"] = ");
                matris[i][j] = scanner.next();
            }
        }
        
        System.out.println("\n");
        
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println("\n");
        }
		
		
		
		
		

	}

}

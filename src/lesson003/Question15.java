package lesson003;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		// burcu söyleyen prog
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Doğum AYINIZ =");
		int ay=scanner.nextInt();
		
		System.out.println("Doğum Gününüz =");
		int gun=scanner.nextInt();
		switch (ay) {
		case 1:
			if (gun<=21) {
				System.out.println("oğlak");
			}else {
				System.out.println("kova");
			}
			
			break;
		case 2:
			if (gun<=19) {
				System.out.println("kova");
			}else {
				System.out.println("balık");
			}
			
			
		default:
			break;
		}
		
	}

}

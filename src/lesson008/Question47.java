package lesson008;

public class Question47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Bir dizide art arda gelen 2 indexin sayı değeri 2 ise true yoksa false yazdıralım
		
		int [] sayilar= {2,2,-256,-256,2,2,1258,2,32};
		boolean check=false;
		int sayac=0;
		for (int i = 0; i < sayilar.length-1; i++) {
			if (sayilar[i+1]==2 && sayilar[i]==2) {
				check=true;
				sayac++;
			
			}
			}
		System.out.println(check);
	
		System.out.println("Toplam= "+sayac+" tane ard arda 2 var");
		

	}

}

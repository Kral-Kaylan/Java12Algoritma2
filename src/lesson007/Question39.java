package lesson007;

public class Question39 {

	public static void main(String[] args) {
		
	// Dizideki elemanların kontrolü ve İşlenmesi

		int[] array = { 1, 4, 4, 2, 4, 4, 2, 2, 9, 2, 8 };
		
		int sayac1=0,sayac2=0;
				for (int i = 0; i < array.length; i++) {
					if (array[i]==2 ) {
						sayac1++;
					}else if (array[i]==4) {
						sayac2++;
					}
				}
		
		if (sayac1<sayac2) {
			System.out.println("Dizide ki 2 sayısı 4 sayısından daha fazladır "+sayac1+"adet 2 vardır");
		}else if (sayac1==sayac2) {
			System.out.println("Dizide 2 ve 4 sayısı eşittir "+sayac1+" adet vardır");
		}
		else {
			System.out.println("Dizide ki 4 sayısı 2 sayısından daha fazladır "+sayac2+"adet 4 vardır");
		}
		

	}

}

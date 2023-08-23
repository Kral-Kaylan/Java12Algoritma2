package lesson007;

public class Question41 {

	public static void main(String[] args) {
		
		
		// DİZİDEKİ EN BÜYÜK 2. ELEMANI BULALIM 

		
		int[] sayilar = { 0, 120, -5, -85, -256, 16, 1258, 81, 14 };
		int enbuyuk=Integer.MIN_VALUE,enbuyuk2=Integer.MIN_VALUE;
		for (int i = 0; i < sayilar.length; i++) {
            if (enbuyuk <= sayilar[i]) {
                enbuyuk = sayilar[i];
            }
        }
        
        for (int i = 0; i < sayilar.length; i++) {
            if (enbuyuk2 <= sayilar[i] && sayilar[i] < enbuyuk) {
                enbuyuk2 = sayilar[i];
            }
        }
 
        System.out.print("\nİkinci En Büyük Sayı :" + enbuyuk2);
		
		
		
		
		
		
		
		
		
	}

}

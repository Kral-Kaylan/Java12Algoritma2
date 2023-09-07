package lesson14_05_09_2023;

public class Profile {
	
	// attribute, property,field ( Uye değişkenlere verilen diğer isimlendirmeler).
	
	
	public String profilResmi;
	public String userName;
	public String Isim;
	public int takipciSayisi;
	public int takipSayisi;
	public String[] post;
	public int postSayisi;
	public boolean maviTik;
	public static int  toplamProfilSayisi;
		
	
	
	
	public Profile() {
	post= new String[10];
	
	toplamProfilSayisi++;
	}
	// Post oluşturma methodu yazalım
//  String isim
	
	public void createPost(String isim) {
		this.post[postSayisi]=isim;
		System.out.println(isim+" Post Oluşturuldu..");
		postSayisi++;
		
	}
	// Profil ismini Güncelle Methodu yazalım.
	
	public void edithProfil(String isim) {
		this.Isim=isim;
		System.out.println(this.Isim+" Profil düzenledi.");
	}
	public void istegiKabulEt() {
		System.out.println("Takip edildi.");
		 takipciSayisi+=1;
		 maviTik();
	}
	public void takiptenCıkar() {
		if (takipciSayisi>0) {
			System.out.println("Takipten çıkarıldı.");
			 takipSayisi-=1;
			 maviTik();
		}else {
			System.out.println(" Takipçiniz yok");
		}
	
	}
	
	public void maviTik () {
	
		if (takipciSayisi>5) {
			System.out.println(" Mavi TİK alabilirsiniz");
			this.maviTik=true;
		}else {
			System.out.println("Mavi tik almak için yeterli takipçiniz yok.");
			maviTik=false;
		}
	
	}
	
	public void profilBilgileriniGoster() {
	System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Profile [Isim=" + Isim + ", takipciSayisi=" + takipciSayisi + ", takipSayisi=" + takipSayisi
				+ ", maviTik=" + maviTik + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
}

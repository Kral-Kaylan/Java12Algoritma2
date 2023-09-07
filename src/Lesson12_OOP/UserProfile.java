package Lesson12_OOP;

public class UserProfile {
	
	String userName;
	String about;
	String avatar;
	int followers;
	int following;
	int postCount;
	String name;
	String surname;
	
	
	public void editProfile() {
		System.out.println(name+" Profilini düzenledi.");
	}
	
	public void shareStory() {
		System.out.println("Hikaye oluşturuldu.");
	}
	public void createPost() {
		System.out.println("Post oluşturuldu.");
		postCount+=1;
	}
	public void addFriend() {
		System.out.println("Takip edildi.");
		following+=1;
	}
	public void getInformation() {
		System.out.println("====Profil Bilgiler===");
		System.out.println("İsim-Soyisim: "+name+" "+surname);
		System.out.println("Kullanıcı İsmi: "+userName);
		System.out.println("Post Sayısı: "+postCount);
		System.out.println("Takipçi SAYISI: "+followers);
		System.out.println("Takip Sayısı: "+following);
		System.out.println("************************");
		
		
	}
	
	
	
}

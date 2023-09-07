package lesson14_05_09_2023;

public class Runner {

	public static void main(String[] args) {


		Profile ahmetProfili= new Profile();
		
		ahmetProfili.userName="Ahmet";
		ahmetProfili.Isim="Ahmet1";
		System.out.println(ahmetProfili.Isim+" "+ahmetProfili.userName);
		
		System.out.println(ahmetProfili.postSayisi);
		
		ahmetProfili.createPost("Ankarada Okey Keyfisi");
		ahmetProfili.createPost("Ankarada Okey Keyfisi");
		ahmetProfili.createPost("Ankarada Okey Keyfisi");
		ahmetProfili.createPost("Ankarada Okey Keyfisi");
		System.out.println(ahmetProfili.postSayisi);
		
		Profile mehmetProfile=new Profile();
		
		mehmetProfile.createPost("İstanbulda nargile keyfisi");
		mehmetProfile.createPost("İstanbulda nargile keyfisi");
		mehmetProfile.createPost("İstanbulda nargile keyfisi");
		mehmetProfile.createPost("İstanbulda nargile keyfisi");
		mehmetProfile.createPost("İstanbulda nargile keyfisi");
		
		System.out.println(mehmetProfile.postSayisi);
		
ahmetProfili.profilBilgileriniGoster();
		
		
		
		
		
		
		
		
	}

}

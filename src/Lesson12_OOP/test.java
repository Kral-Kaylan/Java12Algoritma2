package Lesson12_OOP;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserProfile profile1=new UserProfile(); // profile1 userprofilden üretilmiş bir nesne.
		
		profile1.name="Kral";
		profile1.surname="KAYLAN";
		profile1.userName="Kyln";
		profile1.followers=100;
		profile1.following=150;
		profile1.postCount=20;
		
		System.out.println(profile1.name);
		System.out.println(profile1.surname);
		System.out.println(profile1.userName);
		System.out.println(profile1.followers);
		System.out.println(	profile1.followers);
		
		profile1.editProfile();
		profile1.createPost();
		profile1.addFriend();
		profile1.getInformation();
		System.out.println(profile1);// Stackte bulunduğu adresi gösterir.!!!!
		
	}

}

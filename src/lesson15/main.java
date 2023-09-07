package lesson15;

public class main {

	public static void main(String[] args) {

		Account account = new Account(1000);  // 2 YENİ ACCOUNT NESNESİ OLUŞTURDUK.
		Account account1 = new Account(3000);// BUNLARA BAKİYE DEĞERLERİ ATADIK.CONSTRUCTOR SAYESİNDE ATADIK.
//
//		System.out.println(account.getMoney());// Account nesnesinin anlık hesap bilgisi getMoney ile aldık.
//		System.out.println(account1.getMoney());
//		
//		
//		AccountManager accountManager=new AccountManager();
//		
//		accountManager.paraCek(account1, 500);
//		
//		System.out.println(account.getMoney());
//		
//		accountManager.hesapBilgileriYazdir(account1);
//		
//		
//		User user= new User("KRAL","KAYLAN",account1);
//		System.out.println(user.getEmail());
//		user.setAccount(account);
		
		
		UserManager manager= new UserManager();
		
		manager.krediBasvurusundaBulun(account1, 10000);
		System.out.println(account1.getIstenenKrediMiktari());
		System.out.println(account1.isKrediBasvurusu());
		
		AdminManager adminManager=new AdminManager();
		adminManager.basvuruOnayla(account1);
		System.out.println(account1.getMoney());
		
		
		
		
		
		
		
		
	}

}

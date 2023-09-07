package lesson15;

public class User {
	
	
	private String name;
	private String surName;
	private String email;
	private Account account;
	
	
	
	// Boş Constructor
	public User() {
		super();
	
	}
    public User(String name, String surName, Account account) {
		super();
		this.name = name;
		this.surName = surName;
		this.email =UserManager.generateEmail(name, surName) ;
		this.account = account;
	}
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	

}

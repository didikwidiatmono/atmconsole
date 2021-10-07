package models;

public class Account {
	private String name;
	private int balance;
	private Owe hasOwe;
	private Claim hasClaim;
	private int isLogin;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Owe getHasOwe() {
		return hasOwe;
	}

	public void setHasOwe(Owe hasOwe) {
		this.hasOwe = hasOwe;
	}

	public Claim getHasClaim() {
		return hasClaim;
	}

	public void setHasClaim(Claim hasClaim) {
		this.hasClaim = hasClaim;
	}

	public int getIsLogin() {
		return isLogin;
	}

	public void setIsLogin(int isLogin) {
		this.isLogin = isLogin;
	}
	
	
}

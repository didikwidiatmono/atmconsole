package models;

public class Claim {
	private String name;
	private int nominal;
	
	
	public Claim(String name, int nominal) {
		this.name = name;
		this.nominal = nominal;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNominal() {
		return nominal;
	}
	public void setNominal(int nominal) {
		this.nominal = nominal;
	}
	
	
}

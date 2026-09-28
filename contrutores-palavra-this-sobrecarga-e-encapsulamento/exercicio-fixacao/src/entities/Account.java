package entities;

public class Account {

	private int cod;
	private String name;
	private double sale;
	
	public Account(int cod) {
		this.cod = cod;
	}
	
	public Account(int cod, String name) {
		this.cod = cod;
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addDeposit(double sale) {
		this.sale += sale; 
	}
	
	public void removeDeposit(double sale) {
		this.sale -= sale + 5.00;
	}
	
	public String toString() {
		return "Accont "
				+ cod
				+ ", Holder: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", sale);
	}
	
}





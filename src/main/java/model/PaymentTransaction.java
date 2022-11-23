package model;

public class PaymentTransaction {
	
	private int id;
    private Account originAccount;
    private Account destinationAccount;
    private double quantity;
    private String concept;
    private String datetime;
    
    
	public PaymentTransaction(int id, double quantity, String concept, String datetime) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.concept = concept;
		this.datetime = datetime;
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Account getDestinationAccount() {
		return destinationAccount;
	}
	
	public void setDestinationAccount(Account destinationAccount) {
		this.destinationAccount = destinationAccount;
	}
	
	public Account getOriginAccount() {
		return originAccount;
	}
	
	public void setOriginAccount(Account originAccount) {
		this.originAccount = originAccount;
	}
	
	public double getQuantity() {
		return quantity;
	}
	
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	public String getConcept() {
		return concept;
	}
	
	public void setConcept(String concept) {
		this.concept = concept;
	}
	
	public String getDatetime() {
		return datetime;
	}
	
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
    
}

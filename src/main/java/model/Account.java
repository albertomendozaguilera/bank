package model;

import java.util.ArrayList;
import java.util.List;

public class Account {
	
	private User user;
    private String iban;
    private double balance;
    private List<PaymentTransaction> transactionsList;
    
    
    public Account(User user, String iban, double balance) {
		super();
		this.user = user;
		this.iban = iban;
		this.balance = balance;
		this.transactionsList = new ArrayList();
	}
	
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public String getIban() {
		return iban;
	}
	
	public void setIban(String iban) {
		this.iban = iban;
	}
	
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public List<PaymentTransaction> getTransactionsList() {
		return transactionsList;
	}
	
	public void addTransaction(PaymentTransaction transaction) {
		this.transactionsList.add(transaction);
	}
    
}

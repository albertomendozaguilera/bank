package model;

import java.util.ArrayList;
import java.util.List;

public class User {
	private Integer id;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String email;
	private String phoneNumber;
	private List<Account> accountsList;
	
	
	public User(String firstName, String lastName, String username, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.accountsList = new ArrayList();
	}
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public void setAccountsList(List<Account> accountsList) {
		this.accountsList = accountsList;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

	public List<Account> getAccountsList() {
		return accountsList;
	}


	public void addAccount() {
		this.accountsList.add(new Account(this, "ES12 3456 7890 1234", 0));
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + firstName + ", lastname=" + lastName+ "]";
	}
	
}

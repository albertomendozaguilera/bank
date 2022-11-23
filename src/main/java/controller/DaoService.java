package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

import model.Account;
import model.PaymentTransaction;
import model.User;

@Component
public class DaoService {
	// JPA/Hibernate > DataBase
	// UserDaoService Static List
	
	private static List<User> users = new ArrayList<>();
	
	private static int usersCount = 0;
	
	static {
		/*User user = new User("admin", "admin", "bootcamp4", "solera@solera.com", "123456789");
		user.setId(usersCount);
		//user.addAccountsList(new Account(user, "ES34 1234 1234 1234", 1000));
		users.add(user);
		*/
	}
	
	public List<User> findAllUsers(){
		return users;
	}
	
	public User findOne(int id){
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().orElse(null);
	}
	
	public List<User> findByName(String name){
		ArrayList<User> findedUsers = new ArrayList();
		for (User user : users) {
			if (user.getFirstName().equals(name)) {
				findedUsers.add(user);
			}
		}
		return findedUsers;
	}
	
	public User saveUser(User user){
		user.setId(++usersCount);
		users.add(user);
		return user;
	}
	
	public void addAccount (User user) {
		users.get(user.getId()).addAccount();
	}
	
	public void retrieveAccounts (User user, String iban) {
		//users.get(user.getId()).getAccountsList().get;
	}
	
	public List<PaymentTransaction> getAllTransactions (Account account) {
		return account.getTransactionsList();
	}
	
	public PaymentTransaction addTransaction (Account account, Account account2, PaymentTransaction transaction) {
		transaction.setOriginAccount(account);
		transaction.setDestinationAccount(account2);
		account.addTransaction(transaction);
		account2.addTransaction(transaction);
		return transaction;
	}
	
	
	
	
	
	
	
}

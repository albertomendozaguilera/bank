package controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import model.Account;
import model.PaymentTransaction;
import model.User;

@RestController
public class TransactionsController {
	
	private DaoService service;
	
	@PostMapping(path = "/all_transactions")
	public List<PaymentTransaction> retrieveUser(@RequestBody Account account){
		return account.getTransactionsList();
	}
	
	@PostMapping(path = "/add_transaction")
	public ResponseEntity<Object> addTransaction(@RequestBody Account account, Account account2, PaymentTransaction paymentTransaction) {
		PaymentTransaction paymentTransactionadded = service.addTransaction(account, account2, paymentTransaction);
		// /users/4 -> /users/{id}, users.getId
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(paymentTransactionadded.getId())
				.toUri();
		return ResponseEntity.created(location ).build();
	}
	
}
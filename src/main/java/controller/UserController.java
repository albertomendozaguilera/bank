package controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import model.User;

@RestController
public class UserController {
	
	private DaoService service;
	
	public UserController(DaoService service) {
		this.service = service;
	}
	
	//GET /users/1
	@GetMapping(path = "/user/{id}")
	public User retrieveUser(@PathVariable int id){
		User user = service.findOne(id);
		
		if(user == null) {
			//throw new UserNotFoundException("id: " + id);
		}
		
		return user;
	}
		
	//POST /users
	@PostMapping(path = "/add_user")
	public ResponseEntity<Object> createUser(@RequestBody User user) {
		User savedUser = service.saveUser(user);
		// /users/4 -> /users/{id}, users.getId
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedUser.getId())
				.toUri();
		return ResponseEntity.created(location ).build();
	}
	
}

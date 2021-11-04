package com.algonquin.demo.user;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algonquin.demo.location.Location;

@RestController
public class Usercontroller {
	 @RequestMapping(value="/users")
	    public List<User> getAllUsers() {
	        User user1 = new User("u1","John","smith","sam@test.ca","123456",new Location("11","Ottawa"));
	        User user2 = new User("u2","John","Sam","sam@test.ca","123456",new Location("12","Toronto"));
			return Arrays.asList(user1,user2);
	        
	        
	    }
	

}






package com.services.servicejp;

import java.util.List;



public interface Userservice {

	 
 public List<User> getAllUsers();
 
 public User getUserByemail(String email);
 
 public void saveOrUpdate(User user);
 

}
package com.services.servicejp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class Userserviceimpl implements Userservice {
 
 @Autowired
Userrepository userRepository;

 @Override
 public List<User> getAllUsers() {
  return (List<User>) userRepository.findAll();
 }


 @Override
 public void saveOrUpdate(User user) {
 userRepository.save(user);
 }


@Override
public User getUserByemail(String email) {
	// TODO Auto-generated method stub
	return null;
}

 

}

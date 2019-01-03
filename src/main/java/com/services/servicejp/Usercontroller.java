package com.services.servicejp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping(value="/login")
public class Usercontroller {

 @Autowired
 Userservice userService;
 
 @RequestMapping(value="/register", method=RequestMethod.GET)
 public ModelAndView list() {
  ModelAndView model = new ModelAndView("user_list");
  List<User> userList = userService.getAllUsers();
  model.addObject("userList", userList);
  
  return model;
 }
 
 
 @RequestMapping(value="/login", method=RequestMethod.POST)
 public ModelAndView save(@ModelAttribute("loginForm") User user) {
 userService.saveOrUpdate(user);
  
  return new ModelAndView("redirect:/user/list");
 }
 
 
}

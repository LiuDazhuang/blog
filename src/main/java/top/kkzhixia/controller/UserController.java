package top.kkzhixia.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import top.kkzhixia.modle.User;
import top.kkzhixia.service.UserService;

@Controller
public class UserController {

	@Autowired
	public UserService userService;
	
	@RequestMapping(value = {"","/findAlluser"},method = RequestMethod.GET)
	@ResponseBody
	public List<User>  findAll(){
		return userService.findAll();
//		return "index";
	}
	
	
	@RequestMapping(value = {"","/test"},method = RequestMethod.GET)
	@ResponseBody
	public String  test(){
//		return userService.findAll();
		return "hello world!";
	}
}

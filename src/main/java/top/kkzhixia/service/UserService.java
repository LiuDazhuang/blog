package top.kkzhixia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.kkzhixia.mapper.UserMapper;
import top.kkzhixia.modle.User;

@Service
public class UserService {
	@Autowired
	public UserMapper userMapper;

	public List<User> findAll() {
		return userMapper.findAll();
	}
	
	

}

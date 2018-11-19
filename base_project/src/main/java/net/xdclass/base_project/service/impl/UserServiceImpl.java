package net.xdclass.base_project.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import net.xdclass.base_project.domain.User;
import net.xdclass.base_project.mapper.UserMapper;
import net.xdclass.base_project.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	 @Autowired
	 private UserMapper userMapper;
	 
	@Override
	public int add(User user) {
		userMapper.insert(user);
		int id = user.getId();
		return id;
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public int addAccount() {
		User user = new User();
		user.setAge(11);
		user.setCreateTime(new Date());
		user.setName("xdclass");
		user.setPhone("666");
		return 0;
	}
}

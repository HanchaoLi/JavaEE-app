package net.xdclass.base_project.service;

import org.springframework.transaction.annotation.Propagation;

import net.xdclass.base_project.domain.User;

public interface UserService {

	public int add(User user);
	
	public int addAccount();
	
}

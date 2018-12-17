package net.xdclass.base_project.service.impl;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import net.xdclass.base_project.domain.User;
import net.xdclass.base_project.mapper.UserMapper;
import net.xdclass.base_project.service.UserService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

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
	
//	@Override
//	@Transactional(propagation=Propagation.REQUIRED)
//	public int addAccount() {
//		User user = new User();
//		user.setAge(11);
//		user.setCreateTime(new Date());
//		user.setName("xdclass");
//		user.setPhone("666");
//		return 0;
//	}
	
	
	@Override
	public int addAccount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static final Map<String, User> dataMap = new java.util.HashMap<String, User>();
	static {
		dataMap.put("1", new User(1, "dtgd", "1111123", 234, new Date()));
		dataMap.put("2", new User(2, "ddfsa", "asfdzv", 234, new Date()));
		dataMap.put("3", new User(3, "dd12", "111zxvzv1123", 234, new Date()));
		dataMap.put("4", new User(4, "dd1e", "111zxvv1123", 234, new Date()));
		dataMap.put("5", new User(5, "ddasd", "11zxvvz11123", 234, new Date()));
	}
	
	public Flux<User> getAllUsers() {
		Collection<User> list = UserServiceImpl.dataMap.values();
		return Flux.fromIterable(list);
	}
	
	//  because this is non-blocking now, so id should be unchangeable, 
	public Mono<User> getById(final String id) {
		return Mono.justOrEmpty(UserServiceImpl.dataMap.get(id));
	}
	
	public Mono<User> deleteById(final String id) {
		return Mono.justOrEmpty(UserServiceImpl.dataMap.remove(id));
	}
}

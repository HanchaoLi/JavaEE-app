package net.xdclass.base_project.controller;


import java.time.Duration;
import java.util.Date;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.xdclass.base_project.domain.JsonData;
import net.xdclass.base_project.domain.User;
import net.xdclass.base_project.mapper.UserMapper;
import net.xdclass.base_project.service.UserService;
import net.xdclass.base_project.service.impl.UserServiceImpl;
import net.xdclass.base_project.task.AsyncTask;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *@作者 小D课堂  小D
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {
	
//	@Autowired
//	private UserService userService;
	
	private final UserServiceImpl userService;
	
	public UserController(final UserServiceImpl userService) {
		this.userService = userService;
	}
	@GetMapping("hello")
	public Mono<String> hello(){
		
       return Mono.just("hello");
	}
	
	@GetMapping("find")
	public Mono<User> findById(final String id){
		return userService.getById(id);
	}
	/**
	 * get one, show one, not return only get all elements
	 * @return
	 */
	@GetMapping(value="getAll", produces=MediaType.APPLICATION_STREAM_JSON_VALUE)
	public Flux<User> getAll(){
		return userService.getAllUsers().delayElements(Duration.ofMillis(300));
	}
	
	@DeleteMapping("delete")
	public Mono<User> delete(final String id){
		return userService.deleteById(id);
	}
	/**
	 * 功能描述: user 保存接口
	 * @return
	 */
//	@GetMapping("add")
//	public Object add(){
//		
//		User user = new User();
//		user.setAge(11);
//		user.setCreateTime(new Date());
//		user.setName("xdclass");
//		user.setPhone("10010000");
//		int id = userService.add(user);
//		
//       return JsonData.buildSuccess(id);
//	}
	
//	@Autowired
//	private UserMapper userMapper;
//	
//	@GetMapping("findAll")
//	public Object findAll(){
//		
//       return JsonData.buildSuccess(userMapper.getAll());
//	}
//	
//	@GetMapping("findById")
//	public Object findById(long id){
//       return JsonData.buildSuccess(userMapper.findById(id));
//	}
//	
//	@GetMapping("del_by_id")
//	public Object delById(long id){
//	userMapper.delete(id);
//       return JsonData.buildSuccess();
//	}
	
//	@GetMapping("update")
//	public Object update(String name,int id){
//		User user = new User();
//		user.setName(name);
//		user.setId(id);
//		userMapper.update(user);
//	    return JsonData.buildSuccess();
//	}
	
//	@GetMapping("transac")
//	public Object transac(){
//		int id = userService.addAccount();
//	    return JsonData.buildSuccess(id);
//	}
//	
//	@Autowired
//	private AsyncTask task;
//	
//	@GetMapping("test/async")
//	public JsonData async(){
//		long start = System.currentTimeMillis();
////		task.task1();
////		task.task2();
////		task.task3();
//		Future<String> test4 = task.task4();
//		Future<String> test5 = task.task5();
//		for (;;) {
//			if (test4.isDone() && test5.isDone()) {
//				break;
//			}
//		}
//		long end = System.currentTimeMillis();
//		System.out.println("total time: " + (end - start));
//		return JsonData.buildSuccess("total time: " + (end - start));
//	}
}
